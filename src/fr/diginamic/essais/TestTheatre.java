package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre th = new Theatre("Mogador", 200);
		th.reservation(30,50);
		th.reservation(30,50);
		th.reservation(30,50);
		th.reservation(30,50);
		th.reservation(30,1);
		
	}

}
