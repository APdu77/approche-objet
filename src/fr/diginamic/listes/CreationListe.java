package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>	list = new ArrayList<>();
		
		for (int i=0;i<101;i++) {
			list.add(i);
		}
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(5));

	}

}
