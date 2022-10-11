package entites;

import entites.AdressePostale;

public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	// variables d'INSTANCE donc classe Stateful (par opposition a stateless)
	public String nom;
	public String prenom;
	public AdressePostale adrPost;
	
	
	// variable de Classe (i.e. static) = valeur partagee
	// une methode static ne peut acceder que aux methodes et variables static
	static String pays = "FRANCE";
		// variable de Classe (i.e. static) = valeur non modifiable
		//static final String pays = "FRANCE";
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}


	public Personne(String nom, String prenom, AdressePostale adrPost) {
		this.nom = nom;
		this.prenom = prenom;
		this.adrPost = adrPost;
	}

	public void afficherIdentite () {
		System.out.println(prenom+" "+nom.toUpperCase());
	}	
	
	public void setNom (String nvNom) {
		this.nom = nvNom;
	}
	
	public void setPrenom (String nvPrenom) {
		this.prenom = nvPrenom;
	}
	
	public void setAdresse (AdressePostale nvAdresse) {
		adrPost = nvAdresse;
	}
	
	public String getNom () {
		return this.nom ;
	}
	
	public String getPrenom () {
		return this.prenom ;
	}
	
	public AdressePostale getAdresse () {
		return this.adrPost;
	}
	
}
