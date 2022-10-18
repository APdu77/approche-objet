package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHab implements Comparator<Ville>{

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		return o1.getNbHab() - o2.getNbHab();
	}

	
	
}
