package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import metier.MetierCatalogueImpl;
import service.CatalogueServiceImpl;

public class ServeurRMI {

	public static void main(String[] args) {
		
		MetierCatalogueImpl metier = new MetierCatalogueImpl();
		
		try {
			CatalogueServiceImpl catservice = new CatalogueServiceImpl(metier);
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://localhost:1099/catalogue", catservice);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
