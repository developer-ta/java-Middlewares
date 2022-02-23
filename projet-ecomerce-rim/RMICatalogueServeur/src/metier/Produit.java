package metier;

import java.io.Serializable;

public class Produit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3247452317197493772L;
	private Long idProduit;
	private String nomProduit;
	private double prix;
	private String photo;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(Long idProduit, String nomProduit, double prix, String photo) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.photo = photo;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}	
	
	
}
