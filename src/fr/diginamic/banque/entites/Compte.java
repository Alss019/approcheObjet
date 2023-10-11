package fr.diginamic.banque.entites;

public class Compte {

	private String numCompte;
	private double soldeCompte;
	
	public Compte(String numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Numero de compte=" + numCompte  + "\nsoldeCompte=" + soldeCompte;
	}

	/**
	 * @return the numCompte
	 */
	public String getNumCompte() {
		return numCompte;
	}

	/**
	 * @param numCompte the numCompte to set
	 * @return 
	 */
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * @return the soldeCompte
	 */
	public double getSoldeCompte() {
		return soldeCompte;
	}

	/**
	 * @param soldeCompte the soldeCompte to set
	 */
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
