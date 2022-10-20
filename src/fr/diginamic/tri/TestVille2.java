package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> villes = new ArrayList<>();
		
		Ville v1 = new Ville("Nice",343_000);
		villes.add(v1);
		Ville v2 = new Ville("Carcassonne",47_800);
		villes.add(v2);
		villes.add(new Ville("Narbonne",53_400));
		villes.add(new Ville("Lyon",484_000));
		villes.add(new Ville("Foix",9_700));
		villes.add(new Ville("Pau",77_200));
		villes.add(new Ville("Marseille",850_700));
		villes.add(new Ville("Tarbes",40_600));
		

	
		System.out.println(villes);
		//int result = v1.getNom().compareTo(villes.get(2).getNom());
		//deja definie dans Ville2
		Collections.sort(villes);//using comparable
		System.out.println(villes);
		Collections.shuffle(villes);
		System.out.println(villes);
		Collections.sort(villes, new ComparatorHab());
		System.out.println(villes);
		Collections.sort(villes, new ComparatorNom());
		
		for (Ville v: villes)	{
			System.out.println(v);
		}
		
		
		
	}

}
