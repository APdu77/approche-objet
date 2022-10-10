package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AdressePostale adr1 = new AdressePostale();
		
	adr1.numRue = 18;
	adr1.libelleRue = "rue des Tilleuls";
	adr1.codePostal = 75008;
	adr1.ville= "Paris";
		
	Personne pers1 = new Personne();
		
	pers1.nom = "Moore";
	pers1.prenom = "Roger";
	pers1.adrPost = adr1;
		
	
	Personne pers2 = new Personne ();

	pers2.nom = "DeVito";
	pers2.prenom = "Daniel";
	pers2.adrPost = new AdressePostale();
	pers2.adrPost.numRue = 85;
	pers2.adrPost.libelleRue = "allee des vergers";
	pers2.adrPost.codePostal = 13000;
	pers2.adrPost.ville = "Mars";
	
	System.out.println (pers2.adrPost.ville);
	
	}

}
