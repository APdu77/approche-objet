package fr.diginamic.entites;

public class Theatre {

	private final String nom ;
	private final int capaMax ;
	private int totResa ;
	private double recette ;
	//private final double prix ;
	//private int nbClielnts ;
	
	
	public Theatre(String nom, int capaMax) {
		super();
		this.nom = nom;
		this.capaMax = capaMax;
		//this.totClients = totClients;
		//this.recette = recette;
		//this.prix = prix;
		//this.nbClients = nbClients;
	}


	public void reservation (double prix, int nbClients) {
		if (nbClients + totResa <= capaMax )	{
			totResa = nbClients + this.totResa ;
			recette = recette + nbClients * prix ;
			System.out.println(recette);
		}
		else	{
			System.err.println("Erreur!");
		}
	}
	
	 
	
	
}
