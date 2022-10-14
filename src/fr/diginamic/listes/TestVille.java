package fr.diginamic.listes;

import java.util.ArrayList;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> villes = new ArrayList<>();
		
		Ville v1 = new Ville("Nice",343_000);
		villes.add(v1);
		villes.add(new Ville("Carcassonne",47_800));
		villes.add(new Ville("Narbonne",53_400));
		villes.add(new Ville("Lyon",484_000));
		villes.add(new Ville("Foix",9_700));
		villes.add(new Ville("Pau",77_200));
		villes.add(new Ville("Marseille",850_700));
		villes.add(new Ville("Tarbes",40_600));
		
//		System.out.println(villes.get(0).getNom());
//		System.out.println(v1.getNom());
//		System.out.println(villes.get(7).getNom());
//		System.out.println(villes.get(5).getNbHab());
		
		Ville vmax = villes.get(0);
		for (int i=1;i<villes.size();i++)	{
			if (villes.get(i).getNbHab() > vmax.getNbHab() )	{
				vmax = villes.get(i);	
			}
		}
		
		Ville vmin = villes.get(0);
		for (int i=1;i<villes.size();i++)	{
			if (villes.get(i).getNbHab() < vmin.getNbHab() )	{
				vmin = villes.get(i);	
			}
		}
		
		System.out.println(villes);
		System.out.println(villes.size());
		System.out.println(vmax.getNom()+" "+vmax.getNbHab());
		System.out.println(vmin.getNom()+" "+vmin.getNbHab());
		villes.remove(vmin);
		System.out.println(villes);
		System.out.println(villes.size());
		
	}

}
