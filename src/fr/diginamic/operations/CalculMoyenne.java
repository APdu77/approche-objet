package fr.diginamic.operations;

public class CalculMoyenne {

	private double[] tab ;
	//private double a;
	
	public CalculMoyenne(double[] tab) {
		super();
		this.tab = tab;
	}
	// avec l'aide de Richard
	public void ajout(double a)	{
		double[] tab2 = new double[tab.length+1];
		for (int i=0;i<=tab.length-1;i++) {
			tab2[i]=tab[i];
		}
		tab2[tab2.length-1] = a;
		this.tab = tab2;
	}
	
	public double calcul()	{
		double moy = 0;
		for (int i=0;i<=tab.length-1;i++)	{
			moy = tab[i]+ moy ;
		}
		return moy/tab.length;
	}
	// avec l'aide de Richard
	public String toString()	{
		String affiche =" ";
		for (int i=0;i<=tab.length-1;i++)	{
		affiche = affiche +" "+tab[i];
		}
		return affiche ;
	}
		

	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}

	
	
	
	
}
