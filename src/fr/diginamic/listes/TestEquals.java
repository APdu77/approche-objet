package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville v1 = new Ville("Carcassonne",47_800);
		Ville v2 = new Ville("Carcassonne",47_800);
		Ville v3 = new Ville("Carcassonne",87_800);
		Ville v4 = new Ville("Carassonne",47_800);
		
		System.out.println(v1==v2);
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
		System.out.println(v1.equals(v4));
		
	}

}
