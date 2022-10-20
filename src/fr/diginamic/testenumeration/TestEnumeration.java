package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Saison[] saisons = Saison.values();
		for (Saison s: saisons)	{
			System.out.println(s);
			System.out.println("----");
			System.out.println(s.getLibelle());
			System.out.println("----------------");
		}
		
		System.out.println("----------------------------------------");
		String nom = "ETE" ;
		System.out.println(Saison.valueOf(nom));
		System.out.println("----------------------------------------");
		String nom2 = "HIVER" ;
		Saison s1 = Saison.affichage(nom2);//ligne "facultative"
		System.out.println(s1);
		
		String nom3 = "Printemps" ;
		System.out.println(Saison.affichage(nom3));
		
	
		
	}

}
