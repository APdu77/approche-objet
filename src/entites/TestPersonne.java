package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Personne pers1 = new Personne("Moore","Roger");
	
	AdressePostale adr1 = new AdressePostale(13, "rue des tilleuls", 75008, "Paris" );
	AdressePostale adr2 = new AdressePostale(85, "rue des vergers", 13000, "Mars" );
	Personne pers2 = new Personne("JP","P",adr2);
		
	pers1.afficherIdentite();
	
	pers1.setNom("Rabbit");
	
	pers1.afficherIdentite();
	
	pers1.setPrenom("Alain");
	
	pers1.afficherIdentite();
	
	pers2.setAdresse(adr1);
	
	//pers1.afficherIdentite();
	
	//System.out.println (pers1);
	
	//System.out.println (pers1.nom);
	System.out.println (pers2.adrPost.ville);
	
	
	}

}
