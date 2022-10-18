package fr.diginamic.maps;

import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.tri.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Ville> villes = new ArrayList<>();
		Ville v1 = new Ville("Nice",343_000);
		Ville v2 = new Ville("Carcassonne",47_800);
		villes.add(v1);
		villes.add(v2);
		villes.add(new Ville("Narbonne",53_400));
		villes.add(new Ville("Lyon",484_000));
		villes.add(new Ville("Foix",9_700));
		villes.add(new Ville("Pau",77_200));
		villes.add(new Ville("Marseille",850_700));
		villes.add(new Ville("Tarbes",40_600));
		
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
//		mapVilles.put("nice", v1);
//		mapVilles.put("carcassonne", v2);
//		mapVilles.put("narbonne", v3);
//		mapVilles.put("lyon", v4);
//		mapVilles.put("foix", v5);
//		mapVilles.put("pau", v6);
//		mapVilles.put("marseille", v7);
//		mapVilles.put("tarbes", v8);
		
		//automatisation
		for (Ville v: villes)	{
			mapVilles.put(v.getNom(), v);
		}
		
		
		
		Integer min = Integer.MAX_VALUE ;
		Ville mv = null ;
		for (Ville m: mapVilles.values())	{
			
			if (m.getNbHab() < min)	{
				min = m.getNbHab();
				mv = m;
			}
			//System.out.println(mv);
		}
		
		
		//System.out.println(mapVilles);
		
		for (String m: mapVilles.keySet())	{
			System.out.println(m+"="+mapVilles.get(m));
		}
		System.out.println("---------------------------");
		System.out.println(mv);
		mapVilles.remove(mv.getNom());
		System.out.println("---------------------------");
		for (String m: mapVilles.keySet())	{
			System.out.println(m+"="+mapVilles.get(m));
		}
	}

}
