package fr.diginamic.maps;

import java.util.HashMap;

import fr.diginamic.tri.Ville;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59,"Lille");
		mapVilles.put(69,"Lyon");
		mapVilles.put(33,"Bordeaux");
		
		for (Integer mv: mapVilles.keySet())	{
			System.out.println(mv);
		}
		
		for (String mv: mapVilles.values())	{
			System.out.println(mv);
		}
	
		System.out.println("Taille : " +mapVilles.size());
	
	
	}

}
