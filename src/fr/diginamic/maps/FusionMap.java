package fr.diginamic.maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<>();
//		map3.put(1,map1.get(1));
//		map3.put(2,map1.get(2));
//		map3.put(3,map1.get(3));
//		map3.put(4,map2.get(4));
//		map3.put(5,map2.get(5));
//		map3.put(6,map2.get(6));
		
		
		// methode automatisee
		map3.putAll(map1);
		
		for (Integer key: map2.keySet())	{
			String val = map2.get(key);
			map3.put( key , val );
		}
		
		for (String mv: map1.values())	{
			System.out.println(mv);
		}
		
		System.out.println("------------------------------");
		
		for (String mv: map2.values())	{
			System.out.println(mv);
		}
		
		System.out.println("------------------------------");
		
		for (String mv: map3.values())	{
			System.out.println(mv);
		}
		
	}

}
