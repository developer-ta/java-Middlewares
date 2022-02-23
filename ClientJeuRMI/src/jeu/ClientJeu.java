package jeu;
import java.rmi.Naming;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ClientJeu {

	public static void main(String[] args) {
		
		try {
			
			//connexion au serveur et création du stub
			Context ctx = new InitialContext();
			IJeuRemote stub = (IJeuRemote) ctx.lookup("blablabla");
			//IJeuRemote stub = (IJeuRemote) Naming.lookup("rmi://localhost:1099/JEU");
			Scanner clavier = new Scanner(System.in);
			
			while(true) {
				System.out.println("Veuillez choisir un numéro entre 0 et 1000");
				int nb = clavier.nextInt();
				if(nb==-1) break;
				String reponse = stub.jouer(nb);
				System.out.println(reponse);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
