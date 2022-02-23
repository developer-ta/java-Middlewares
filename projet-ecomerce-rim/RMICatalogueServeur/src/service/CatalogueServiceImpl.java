package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import metier.MetierCatalogueImpl;
import metier.Produit;

public class CatalogueServiceImpl extends UnicastRemoteObject implements ICatalogue{

	
	private MetierCatalogueImpl metier;
	
	public CatalogueServiceImpl(MetierCatalogueImpl m) throws RemoteException {
		
		//metier = new MetierCatalogueImpl();
		metier = m;
	}

	@Override
	public List<Produit> consulterProduitsParMC(String mc) throws RemoteException {
		
		return metier.getProduitsParMC(mc);
	}

	@Override
	public List<Produit> consulterProduits() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(Long idP) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrixMoyen() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
