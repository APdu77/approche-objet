package fr.diginamic.tri;

public class Ville implements Comparable<Ville>{
	
	private String nom;
	private int nbHab;
	private String codeDept;
	private String nomRegion;
	
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}

	
	public Ville(String nom, String codeDept, String nomRegion, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.codeDept = codeDept;
		this.nomRegion = nomRegion;
	}


	@Override
	public int compareTo(Ville other) {
		// TODO Auto-generated method stub
		return this.nbHab - other.nbHab;
	}
	
	
	public String toString()	{
		return nom+" {"+codeDept+"} "+"{"+nomRegion+"} "+"{"+nbHab+"}";
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


	public String getCodeDept() {
		return codeDept;
	}


	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}


	public String getNomRegion() {
		return nomRegion;
	}


	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	

	
}
