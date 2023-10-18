package fr.diginamic.recensement;


public class Ville {
	
	/**La classe Ville représente le concept de ville dans l'application de Recensement
	 * Elle possede 2 attribut 
	 * 
	 */
	
	String nom;
	String codeCommune;
	String codeDep;
	String codeRegion;
	String nomRegion;
	int populationTotale;
	
	/** Constructeur
	 * @param nom
	 * @param codeCommune
	 * @param codeDep
	 * @param codeRegion
	 * @param nomRegion
	 * @param populationTotale
	 */
	public Ville(String nom, String codeCommune, String codeDep, String codeRegion, String nomRegion, int populationTotale) {
		super();
		this.nom = nom;
		this.codeCommune = codeCommune;
		this.codeDep = codeDep;
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}


	@Override
	public String toString() {
		return nom + " (" + codeDep + ") " + nomRegion.toUpperCase() + " : " +populationTotale + " habitant";
	}


	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/** Getter
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}


	/** Getter
	 * @return the codeDep
	 */
	public String getCodeDep() {
		return codeDep;
	}


	/** Getter
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}


	/** Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}


	/** Getter
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}
}
