package rf.diginamic.banque.entites;

public class Compte {

	private int numero;
	private double solde;
	
	public Compte (int numero,double solde)	{
		this.numero=numero;
		this.solde=solde;
	}
	
	public int getNumero()	{
		return numero;
	}

	public double getSolde()	{
		return solde;
	}
	
	
}
