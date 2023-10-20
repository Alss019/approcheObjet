package listes;

import java.util.Objects;

import annotations.Rules;
import annotations.ToString;
import utils.StringUtils;

public class Ville implements Comparable<Ville>{
	@ToString(uppercase=true, separator=" -> ")
	private String nom;
	@Rules(min = 0)
	@ToString(separator="Hab")
	private int nbHabitant;

	
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return StringUtils.objectToString(this);
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(nbHabitant, nom);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Ville)) {
			return false;
		}
		Ville other= (Ville) obj;
		return Objects.equals(nom, other.getNom()) && nbHabitant == other.getNbHabitant();
	}

	@Override
	public int compareTo(Ville autreVille) {
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

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	
}
