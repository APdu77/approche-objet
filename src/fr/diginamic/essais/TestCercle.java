package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cercle c1 = CercleFactory.creerCercle(5);
		Cercle c2 = CercleFactory.creerCercle(10);
		//Cercle c1 = new Cercle(5);
		//Cercle c2 = new Cercle(10);
		
		System.out.println("Le cercle 1 a une perimetre de "+c1.perimetre()+"m et une surface de "+c1.surface()+"m2");
		System.out.println("Le cercle 2 a une perimetre de "+c2.perimetre()+"m et une surface de "+c2.surface()+"m2");		
	}

}
