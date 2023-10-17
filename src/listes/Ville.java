package listes;

import java.util.Objects;

public class Ville implements Comparable<Ville>{
	
	String nom;
	float nbHabitant;
	
	public Ville(String nom, float nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
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
	public float getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(float nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return "Ville{" +
                "nom='" + nom + '\'' +
                ", population=" + nbHabitant +
                '}';
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
	
}
