package entite;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale(20,"Route de Revel",31400,"Toulouse");
		AdressePostale adr2 = new AdressePostale(123,"Route d'Espagne",31500,"Toulouse");
		
		Personne perso1= new Personne("Dupont","Michel", adr1);	
		Personne perso2= new Personne("Dupont","Marcel",adr2);

		perso1.show();
		perso1.setNom("jean");
		perso1.show();
		
	}

}
