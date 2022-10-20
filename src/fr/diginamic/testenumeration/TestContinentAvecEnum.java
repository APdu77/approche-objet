package fr.diginamic.testenumeration;

import java.util.ArrayList;
import fr.diginamic.listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> villes = new ArrayList<>();

		Ville v1 = new Ville("New York", 18_823_000, Continent.AMERIQUE_N);
		villes.add(v1);
		villes.add(new Ville("Paris", 10_784_800, Continent.EUROPE));
		villes.add(new Ville("Beijing", 21_893_000, Continent.ASIE));
		villes.add(new Ville("Moskov", 12_655_000, Continent.ASIE));
		villes.add(new Ville("Berlin", 3_645_000, Continent.EUROPE));
		villes.add(new Ville("Sydney", 4_676_000, Continent.OCEANIE));
		villes.add(new Ville("Sao Paulo", 11_895_000, Continent.AMERIQUE_S));
		villes.add(new Ville("Dakar", 1_146_000, Continent.AFRIQUE));

		for (Ville v : villes) {
			System.out.println(v);
		}

	}

}
