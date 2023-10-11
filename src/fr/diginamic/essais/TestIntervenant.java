package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		Intervenant per1 = new Salarie("MIRABEL", "Paul", 2500);
		Intervenant per2 = new Pigiste("DUPONT", "Antoine", 15, 80);

		per1.afficher();
		per2.afficher();
	}

}
