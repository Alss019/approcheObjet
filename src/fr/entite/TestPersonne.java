package fr.entite;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Personne perso1= new Personne();
		perso1.nom="Dupont";
		perso1.prenom = "Michel";
		perso1.adresse.numeroRue = 20;
		perso1.adresse.libelleRue = "Route de Revel";
		perso1.adresse.codePostal = 31400;
		perso1.adresse.ville = "Toulouse";
		
		
		Personne perso2= new Personne();
		perso2.nom="Dupont";
		perso2.prenom = "Marcel";
		perso2.adresse.numeroRue = 123;
		perso2.adresse.libelleRue = "Route d'Espagne";
		perso2.adresse.codePostal = 31500;
		perso2.adresse.ville = "Toulouse";
		
		
		
	}

}
