package jeu;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;

public class serveurJeuRMI {

	public static void main(String[] args) {
		
		
		try {
			// Lancement du service RMI
			LocateRegistry.createRegistry(1099);
			
			//Instanciation de l'objet
			JeuRemoteImpl objetdistant = new JeuRemoteImpl();
			
			//Affichage de la référence de l'objet distant en console du serveur
			System.out.println(objetdistant.toString());
			
			//Ajout de l'objet distant dans l'annuaire et on publie l'objet
			//Naming.rebind("rmi://localhost:1099/JEU", objetdistant);
			Context ctx = new InitialContext();
			ctx.rebind("blablabla", objetdistant);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
