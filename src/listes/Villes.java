package listes;

import java.util.Objects;



public class Villes implements Comparable<Villes>{
	
	String nom;
	float nbHabitant;
	EnumContinent continent;
	
	public Villes(String nom, float nbHabitant, EnumContinent continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return 
                "nom = " + nom + 
                ", " + nbHabitant + "Hab"+
                ", " + continent;
	}

//	@Override
//	public int compareTo(Ville autreVille) {
//		return this.nom.compareTo(autreVille.getNom());
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nbHabitant, nom);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Villes)) {
			return false;
		}
		Villes other= (Villes) obj;
		return Objects.equals(nom, other.getNom()) && nbHabitant == other.getNbHabitant();
	}

	@Override
	public int compareTo(Villes autreVille) {
		if(this.nbHabitant > autreVille.getNbHabitant()) {
			return -1;			
		}
		else if(this.nbHabitant < autreVille.getNbHabitant()) {
			return 1;
		}
		return 0;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the nbHabitant
	 */
	public float getNbHabitant() {
		return nbHabitant;
	}

	/** Setter
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(float nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/** Getter
	 * @return the continent
	 */
	public EnumContinent getContinent() {
		return continent;
	}

	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(EnumContinent continent) {
		this.continent = continent;
	}
	
}
