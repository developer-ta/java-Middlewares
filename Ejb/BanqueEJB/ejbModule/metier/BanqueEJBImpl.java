package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Compte;


//Pour publier sa reference dans l'annuaire  (principe des applications distribuées)
@Stateless(name="BK")
public class BanqueEJBImpl implements IBanqueLocal, IBanqueRemote{
	
	//Celui déclaré dans persistence.xml
	@PersistenceContext(unitName="BanqueEJB")
	private EntityManager em;
	
	@Override
	public Compte addCompte(Compte cp) {
		Compte compte = cp;
		em.merge(compte);
		return compte;
	}

	@Override
	public Compte getCompte(Long code) {
		Compte cp = em.find(Compte.class, code);
		if(cp==null) throw new RuntimeException("Compte Introuvable");
		return cp;
	}

	@Override
	public List<Compte> listComptes() {
		Query req = em.createQuery("select c from Compte c");
		return req.getResultList();
	}

	@Override
	public void verser(Long code, double montant) {
		Compte cp = getCompte(code);
		cp.setSolde(cp.getSolde()+montant);
	}

	@Override
	public void retirer(Long code, double montant) {
		Compte cp = getCompte(code);
		if(cp.getSolde() < montant) throw new RuntimeException("Solde insuffisant");
		cp.setSolde(cp.getSolde()-montant);
		
	}

	@Override
	public void virement(Long code1, Long code2, double montant) {
		retirer(code1, montant);
		verser(code2, montant);
		
	}

}
