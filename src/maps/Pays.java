package maps;

public class Pays {

	String nom;
	double nbHabitant;
	String Continent;

	public Pays(String nom, double nbHabitant, String continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		Continent = continent;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the nbHabitant
	 */
	public double getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @return the continent
	 */
	public String getContinent() {
		return Continent;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitant=" + nbHabitant + ", Continent=" + Continent + "]";
	}
}
