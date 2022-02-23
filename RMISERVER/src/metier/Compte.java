package metier;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4464787752781519477L;
	/**
	 * 
	 */
	private int code;
	private double solde;
	private Date dateCreation;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(int code, double solde, Date date) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = date;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date date) {
		this.dateCreation = date;
	}
	
	
}
