package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> villes = new ArrayList<>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");
		
		System.out.println(villes);
		
		String max = villes.get(0);
		for (int i=1;i<villes.size();i++)	{
			if (villes.get(i).length() > max.length() )	{
				max = villes.get(i);	
			}
		}
		
		for (int i=0;i<villes.size();i++)	{
			villes.set(i, villes.get(i).toUpperCase());	
		}
		
		System.out.println(max);
		System.out.println(villes);
		
		for (int i=0;i<villes.size();i++)	{
			if (villes.get(i).charAt(0) == 'N' )	{
				villes.remove(villes.get(i));
			}
		}
		System.out.println(villes);
		
	}

}
