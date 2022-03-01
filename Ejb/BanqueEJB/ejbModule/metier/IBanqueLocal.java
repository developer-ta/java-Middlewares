package metier;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Compte;

@Local
public interface IBanqueLocal {
	public Compte addCompte(Compte cp);
	public Compte getCompte(Long code);
	public List<Compte> listComptes();
	public void verser(Long code, double montant);
	public void retirer(Long code, double montant);
	public void virement(Long code1, Long code2, double montant);
}
