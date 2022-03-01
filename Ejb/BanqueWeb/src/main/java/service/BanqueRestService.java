package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.IBanqueLocal;
import metier.entities.Compte;

@Stateless
@Path("/")
public class BanqueRestService {
	
	@EJB
	private IBanqueLocal metier;
	
	
	@POST
	@Path("/comptes")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte addCompte(Compte cp) {
		return metier.addCompte(cp);
	}
	
	
	@GET
	@Path("/comptes/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte getCompte(@PathParam(value="code")Long code) {
		return metier.getCompte(code);
	}
	
	
	@GET
	@Path("/comptes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Compte> listComptes() {
		return metier.listComptes();
	}
	
	
	@PUT
	@Path("/comptes/verser")
	@Produces(MediaType.APPLICATION_JSON)
	public void verser(
			@FormParam(value="code")Long code,
			@FormParam(value="montant")double montant) {
		metier.verser(code, montant);
	}
	
	
	@PUT
	@Path("/comptes/retirer")
	@Produces(MediaType.APPLICATION_JSON)
	public void retirer(
			@FormParam(value="code")Long code, 
			@FormParam(value="montant")double montant) {
		metier.retirer(code, montant);
	}
	
	
	@PUT
	@Path("/comptes/virement")
	@Produces(MediaType.APPLICATION_JSON)
	public void virement(
			@FormParam(value="code1")Long code1, 
			@FormParam(value="code2")Long code2, 
			@FormParam(value="montant")double montant) {
		metier.virement(code1, code2, montant);
	}
	
	
}
