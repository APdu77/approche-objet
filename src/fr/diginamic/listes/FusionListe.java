package fr.diginamic.listes;

import java.util.ArrayList;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>	list1 = new ArrayList<>();
		list1.add("Rouge");
		list1.add("Vert");
		list1.add("Orange");
		
		ArrayList<String>	list2 = new ArrayList<>();
		list2.add("Blanc");
		list2.add("Bleu");
		list2.add("Orange");

		
		ArrayList<String>	list3 = new ArrayList<>();

		for (int i=0;i<list1.size();i++) {
			list3.add(list1.get(i));
		}
		for (int i=0;i<list2.size();i++) {
			list3.add(list2.get(i));
		}
		
		System.out.println(list3);
		System.out.println(list3.get(5));
	
		
	}

}
