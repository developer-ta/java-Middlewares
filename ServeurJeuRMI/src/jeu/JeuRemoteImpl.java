package jeu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class JeuRemoteImpl extends UnicastRemoteObject implements IJeuRemote{
	
	private int nombreSecret;
	private boolean fin;
	
	public JeuRemoteImpl() throws RemoteException {
		generateSecret();
	}
	
	private void generateSecret() {
		nombreSecret = (int) (Math.random()*1000);
	}

	@Override
	public String jouer(int nombre) throws RemoteException {
		if ( fin == false) {
			if(nombre > nombreSecret) {
				return "Votre valeur est sup�rieure";
			}else if(nombre < nombreSecret) {
				return "Votre valeur est inf�rieure";
			}else {
				fin = true;
				return "Bravo vous avez gagn�";
			}
		}else {
			return "Jeu termin�, le nombre secret �tait"+nombreSecret;
		}
	}

}
