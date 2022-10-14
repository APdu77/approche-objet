package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Operation[] tabOps = new Operation[4];
		tabOps[0] = new Credit("12/12/21",45);
		tabOps[1] = new Debit("07/01/22",-29);
		tabOps[2] = new Credit("01/04/22",9.9);
		tabOps[3] = new Debit("13/04/22",-5);
		//ou Operation[] tabOps = {new Credit("12/12/21",45),new Debit("07/01/22",-29),etc...};
		double soldeCompte = 0 ;
		
		//for (Operation ops : tabOps)	{
		//	System.out.println(ops);
		//}
		
		for (int i = 0; i<tabOps.length;i++) {
			//ou System.out.println(tabOps[i]+" "+tabOps[i].getType());
			System.out.println(tabOps[i]);
			soldeCompte = tabOps[i].getMontant() + soldeCompte ;
			
//			if (tabOps[i].getType().equals("CREDIT"))	{
//				soldeCompte += tabOps[i].getMontant();
//			}
//			else	{
//				soldeCompte -= tabOps[i].getMontant();
//			}
			
			
		}
		
		System.out.println("Le solde actuel est de "+soldeCompte+"$");
		
		
	}

}
