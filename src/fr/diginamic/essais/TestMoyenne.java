package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// equivalent double[] tab = new double[] {15,10,25};
		double[] tab = {15,10,25};
		System.out.println(tab[0]);
		CalculMoyenne tab2 = new CalculMoyenne(tab);
		CalculMoyenne tab3 = new CalculMoyenne(new double[] {15,10,25});
		System.out.println(Arrays.toString(tab));
		System.out.println(tab2);
		System.out.println(tab2.calcul());
		System.out.println(tab3.calcul());
		tab2.ajout(10);
		tab3.ajout(50);
		System.out.println(tab2.calcul());
		System.out.println(tab3.calcul());
		
		
	}

}
