package client;
import java.rmi.Naming;
import java.util.List;
import java.util.Scanner;

import metier.Produit;
import service.ICatalogue;

public class clientCatalogue {

	public static void main(String[] args) {
		
		try {
			ICatalogue stub = (ICatalogue) Naming.lookup("rmi://localhost:1099/catalogue");
			Scanner clavier = new Scanner(System.in);
			System.out.println("Veuillez renseigner un mot clé:");
			String motcle = clavier.nextLine();
			List<Produit> prods = stub.consulterProduitsParMC(motcle);
			for(Produit p: prods) {
				System.out.println("-------------------------------");
				System.out.println("id: "+p.getIdProduit());
				System.out.println("nom: "+p.getNomProduit());
				System.out.println("prix: "+p.getPrix());
				System.out.println("photo: "+p.getPhoto());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
