package entites2;

import entites.AdressePostale;

public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String nom;
	public String prenom;
	public AdressePostale adrPost;
	
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}


	public Personne(String nom, String prenom, AdressePostale adrPost) {
		this.nom = nom;
		this.prenom = prenom;
		this.adrPost = adrPost;
	}

		
	
}
