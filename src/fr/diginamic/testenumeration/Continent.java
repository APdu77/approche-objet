package fr.diginamic.testenumeration;

public enum Continent {

	EUROPE ("europe"),
	AFRIQUE ("afrique"), 
	ASIE ("asie"),
	AMERIQUE_S ("amerique du sud"),
	AMERIQUE_N ("amerique du nord"),
	OCEANIE ("oceanie");
	
	private String libelle;
	
	private Continent(String libelle) {
		this.libelle = libelle;	
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
	
}
