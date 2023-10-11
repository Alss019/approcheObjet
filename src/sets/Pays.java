package sets;

public class Pays {
	
	String nom;
	long nbHabitant;
	double pibParHab;
	
	public Pays(String nom, long nbHabitant, double pibParHab) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHab = pibParHab;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitant=" + nbHabitant + ", getPibTotal()=" + getPibTotal() + "] \n";
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitant
	 */
	public long getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(long nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/**
	 * @return the pibParHab
	 */
	public double getPibParHab() {
		return pibParHab;
	}

	/**
	 * @param pibParHab the pibParHab to set
	 */
	public void setPibParHab(double pibParHab) {
		this.pibParHab = pibParHab;
	}
	
	
    public double getPibTotal() {
        return nbHabitant * pibParHab;
    }
	
}
