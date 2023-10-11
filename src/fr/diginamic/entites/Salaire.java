package fr.diginamic.entites;

public class Salaire {

	String nom;
	String prenom;
	Double salaire;
	
	public Salaire(String nom, String prenom, Double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Salaire [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
	
}
