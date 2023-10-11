package entite2;

import entite.AdressePostale;

public class Personne {
		
	public String nom;
	public String prenom;

	public AdressePostale adresse = new AdressePostale();
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(String nom, String prenom, AdressePostale adresse){
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		
	}

	
	public void show() {
		System.out.println(prenom + " " +nom.toUpperCase());
	}
		
	
	public void setNom(String nom ) {
		 this.nom = nom; 
	}
	public void setPrenom(String prenom ) {
		this.prenom = prenom; 
	}
	public void setAdresse(AdressePostale adresse ) {
		this.adresse = adresse; 
	}
	
	public String getNom(String nom) {
		return this.nom;
	}
	public String getPrenom(String prenom) {
		return this.prenom;
	}
	
	public AdressePostale getAdresse(AdressePostale adresse) {
		return this.adresse= adresse;
	}
}
