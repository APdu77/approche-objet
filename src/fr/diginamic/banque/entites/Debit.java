package fr.diginamic.banque.entites;

class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType()	{
		return "DEBIT";
	}
	
		

}
