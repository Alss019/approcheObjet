package fr.diginamic.recensement;

import java.text.Format;

public class Ville {
	
	String nom;
	String codeCommune;
	String codeDep;
	String codeRegion;
	String nomRegion;
	int populationTotale;
	
	public Ville(String nom, String codeCommune, String codeDep, String codeRegion, String nomRegion, int populationTotale) {
		super();
		this.nom = nom;
		this.codeCommune = codeCommune;
		this.codeDep = codeDep;
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * @return the codeDep
	 */
	public String getCodeDep() {
		return codeDep;
	}
	/**
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	@Override
	public String toString() {
		return nom + " (" + codeDep + ") " + nomRegion.toUpperCase() + " : " +populationTotale + " habitant";
	}
}
