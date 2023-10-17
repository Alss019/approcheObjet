package attributFichier;

public class Ville {
	
	String nom;
	String codeDep;
	String nomRegion;
	int popTotal;
	
	public Ville(String nom, String codeDep, String nomRegion, int popRegion) {
		super();
		this.nom = nom;
		this.codeDep = codeDep;
		this.nomRegion = nomRegion;
		this.popTotal = popRegion;
	}



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/**
	 * @return the codeDep
	 */
	public String getCodeDep() {
		return codeDep;
	}



	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}



	/**
	 * @return the popTotal
	 */
	public int getPopTotal() {
		return popTotal;
	}



	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", codeDep=" + codeDep + ", nomRegion=" + nomRegion + ", popRegion=" + popTotal
				+ "]";
	}

	
	
}
