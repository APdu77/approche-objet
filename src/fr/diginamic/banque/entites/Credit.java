package fr.diginamic.banque.entites;


class Credit extends Operation	{

	public Credit (String date, double montant)	{
		super (date,montant);
	}
	
	@Override
	public String getType()	{
		String type = "CREDIT";
		return type;
	}
	
	
	
	
}
