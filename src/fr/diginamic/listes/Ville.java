package fr.diginamic.listes;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville>{
	
	private String nom;
	private int nbHab;
	private Continent continent;
	
	
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}

	
	public Ville(String nom, int nbHab, Continent continent) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}



	@Override
	public int compareTo(Ville other) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(other.getNom());
	}
	
	@Override
	public boolean equals(Object obj)	{
		if (!(obj instanceof Ville)) {
			return false;
		}
		
		Ville other = (Ville) obj;//on caste obj en Ville
		
		if (other.getNom().equals(this.getNom()) && other.getNbHab()==(this.getNbHab())) {
			return true;
		}
		//else () facultatif
		return false;
	}
	
	
	public String toString()	{
		DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
		symbols.setGroupingSeparator(' ');
		DecimalFormat formatter = new DecimalFormat("###,###", symbols);
		return nom+" {*"+formatter.format(this.nbHab)+"*} "+"{"+continent.getLibelle().toUpperCase()+"}";
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbHab() {
		return nbHab;
	}


	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}



	
}
