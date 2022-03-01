package service;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.IBanqueLocal;
import metier.entities.Compte;

@WebService
public class BanqueWebService {
	
	@EJB
	public IBanqueLocal metier;
	
	@WebMethod
	public void verser(
			@WebParam(name="code")Long code,
			@WebParam(name="montant") double mt) {
			
		metier.verser(code, mt);
	}
	
	
	@WebMethod
	public void retirer(
			@WebParam(name="code")Long code,
			@WebParam(name="montant") double mt) {
			
		metier.retirer(code, mt);
	}
	
	@WebMethod
	public void virement(
			@WebParam(name="code1")Long code1,
			@WebParam(name="code2")Long code2,
			@WebParam(name="montant") double mt) {
			
		metier.virement(code1, code2, mt);
	}

	
	//plus tard rajouter double solde initial
	//initialiser le compte faire le setSolde et setDate
	@WebMethod
	public Compte addCompte(@WebParam(name="cp") Compte cp) {
		return metier.addCompte(cp);
	}

	
	@WebMethod
	public Compte getCompte(@WebParam(name="code") Long code) {
		return metier.getCompte(code);
	}

	@WebMethod
	public List<Compte> listComptes() {
		return metier.listComptes();
	}
	
	
}
