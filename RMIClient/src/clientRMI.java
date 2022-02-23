import java.rmi.Naming;
import java.util.List;

import metier.Compte;
import rmi.IBanqueRemote;

public class clientRMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			
			System.out.println(stub.conversion(10000));
			System.out.println("Consultation d'un compte");
			Compte cp = stub.consulterCompte(10);
			System.out.println("code= "+cp.getCode());
			System.out.println("solde= "+cp.getSolde());
			System.out.println("date de creation: "+cp.getDateCreation());
			System.out.println("Liste des comptes ");
			List<Compte> cptes = stub.listComptes();
			
			for(Compte c:cptes) {
				System.out.println("------------------------------------------");
				System.out.println("code= "+c.getCode());
				System.out.println("solde= "+c.getSolde());
				System.out.println("date de cration: "+c.getDateCreation());
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
