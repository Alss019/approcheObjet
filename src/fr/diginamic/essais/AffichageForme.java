package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void affichageForme(Forme forme) {
		
		System.out.println(forme.calculerSurface());
		System.out.println(forme.calculerPerimetre());

	}

}
