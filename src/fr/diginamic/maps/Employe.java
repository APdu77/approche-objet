package fr.diginamic.maps;

public class Employe {

	private String prenom;
	private double salaire;
	
	
	public Employe(String prenom, double salaire) {
		super();
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	public String toString()	{
		return prenom+"{"+salaire+"$}";
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	
	
}
