package rf.diginamic.banque.entites;

import java.util.Iterator;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte cpt1 = new Compte(37945682,1_000_000);
		CompteTaux cpt2 = new CompteTaux(10938456,15_008,10);
		Compte[] tabCpt = {cpt1,cpt2};
		
		for (int i = 0; i<tabCpt.length;i++) {
			System.out.println(tabCpt[i]);
		}
		//System.out.println(cpt);
		//System.out.println("Le client "+ cpt.getNumero()+" dispose de "+cpt.getSolde());
		
		
	}

}
