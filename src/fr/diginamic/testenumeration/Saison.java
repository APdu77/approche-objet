package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("printemps", 1), ETE("ete", 2), AUTOMNE("automne", 3), HIVER("hiver", 4);

	private String libelle;
	private int numOrdre;

	private Saison(String libelle, int numOrdre) {
		this.libelle = libelle;
		this.numOrdre = numOrdre;
	}

	static Saison affichage(String lib) {

		Saison[] saisons = Saison.values();
		for (Saison s : saisons) {
			if (s.getLibelle().equalsIgnoreCase(lib)) {
				return s;
			}

		}
		return null;


	}

	@Override
	public String toString() {
		return "{super. method} " + super.toString() + " = " + libelle + " est la saison " + numOrdre + " de l'annee"
				+ "\n" + "{this.name method} " + this.name() + " = " + libelle + " est la saison " + numOrdre
				+ " de l'annee";
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNumOrdre() {
		return numOrdre;
	}

	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

}
