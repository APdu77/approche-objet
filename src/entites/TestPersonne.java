package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Personne pers1 = new Personne("Moore","Roger");
	
	AdressePostale adr2 = new AdressePostale(85, "rue des vergers", 13000, "Mars" );
	Personne pers2 = new Personne("JP","P",adr2);
		
	
	System.out.println (pers1.prenom);
	System.out.println (pers1.nom);
	System.out.println (pers2.nom);
	
	
	}

}
