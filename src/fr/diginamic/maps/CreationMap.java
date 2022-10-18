package fr.diginamic.maps;

import java.awt.print.Printable;
import java.util.HashMap;

import fr.diginamic.tri.Ville;

public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe e1 = new Employe("Paul",1750);
		Employe e2 = new Employe("Hicham",1825);
		Employe e3 = new Employe("Yu",2250);
		Employe e4 = new Employe("Ingrid",2015);
		
		HashMap<String, Employe> mapSalaires = new HashMap<>();
		
		mapSalaires.put("paul", e1);
		mapSalaires.put("hicham", e2);
		mapSalaires.put("yu", e3);
		mapSalaires.put("ingrid", e4);
		mapSalaires.put("chantal", new Employe("Chantal",2418));
		
		System.out.println(mapSalaires.size());
		
	}

}
