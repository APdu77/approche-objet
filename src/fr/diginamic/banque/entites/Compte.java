package fr.diginamic.banque.entites;

public class Compte {

	protected int numero;
	protected double solde;
	
	public Compte (int numero,double solde)	{
		this.numero=numero;
		this.solde=solde;
	}
	
	public String toString()	{
		return "Le client "+numero+" dispose de "+solde+"$";
	}
	
	public int getNumero()	{
		return numero;
	}

	public double getSolde()	{
		return solde;
	}
	
	
}
