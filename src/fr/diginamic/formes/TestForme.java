package fr.diginamic.formes;

import fr.diginamic.essais.AffichageForme;


public class TestForme {

	public static void main(String[] args) {
		Forme cercle = new Cercle(4.0);
		Forme carre = new Carre(3.0);
		Forme rectangle = new Rectangle(4,2);

		AffichageForme.affichageForme(cercle);
		AffichageForme.affichageForme(carre);
		AffichageForme.affichageForme(rectangle);
		
		
		
	}
	
	
	
}
