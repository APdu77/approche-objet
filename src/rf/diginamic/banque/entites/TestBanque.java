package rf.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte cpt = new Compte(37945682,1_000_000);
		System.out.println("Le client "+ cpt.getNumero()+" dispose de "+cpt.getSolde());
		
		
	}

}
