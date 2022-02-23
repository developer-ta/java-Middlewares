package metier;


import java.util.ArrayList;
import java.util.List;

import metier.Produit;

public class MetierCatalogueImpl {
	
	private List<Produit> produits = new ArrayList<>();

	public MetierCatalogueImpl() {
		
		produits.add(new Produit(1L, "Pain", 2, "pain.jpeg"));
		produits.add(new Produit(2L, "Beurre", 15, "beurre.jpeg"));
		produits.add(new Produit(3L, "Farine de blé", 2, "farine-de-blé.jpeg"));
		produits.add(new Produit(4L, "Confiture", 2, "confiture.jpeg"));
		produits.add(new Produit(5L, "Biscotte", 2.50, "biscotte.jpeg"));
		produits.add(new Produit(6L, "Vin", 0.5, "vin.jpeg"));
		produits.add(new Produit(7L, "Boursin", 3, "pain.jpeg"));
		produits.add(new Produit(8L, "Cacahuètes", 0.9, "cachuete.jpeg"));
		produits.add(new Produit(9L, "Huile", 2.5, "huile.jpeg"));
		produits.add(new Produit(10L, "Lait", 1.5, "lait.jpeg"));
	}
	
	public List<Produit> listProduits(){
		return produits;
	}
	
	
	public List<Produit> getProduitsParMC(String mc){
		List<Produit> prods = new ArrayList<Produit>();
		for(Produit p:produits) {
			if(p.getNomProduit().indexOf(mc) > 0) {
				prods.add(p);
			}
		}
		
		return prods;
	}
	
	public Produit getProduit(Long idP) {
		
		for(Produit p:produits) {
			if(p.getIdProduit().equals(idP)) {
				return p;
			}
		}
		
		return null;
	}
	
	
}
