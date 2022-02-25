

import java.util.List;

import javax.ejb.Local;

import metier.entities.Compte;

@Local
public interface IBanqueRemote {
	public Compte addCompte(Compte cp);
	public Compte getCompte(Long code);
	public List<Compte> listComptes();
	public void verser(Long code, Double montant);
	public void retirer(Long code, Double montant);
	public void virement(Long code1,Long code2, Double montant);
}
