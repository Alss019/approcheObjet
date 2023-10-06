package fr.entite;


public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 10;
		adr1.libelleRue= "Route de Revel";
		adr1.codePostal = 31400;
		adr1.ville = "Toulouse";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 123;
		adr2.libelleRue = "Route d'Espagne";
		adr2.codePostal = 31500;
		adr2.ville="Toulouse";
	}

}
