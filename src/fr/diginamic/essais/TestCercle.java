package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle cercle1 = CercleFactory.addCercle(5.0);
		Cercle cercle2= CercleFactory.addCercle(10.0);

		
		System.out.println("Cercle 1 - Perimetre: " + cercle1.perimetre());
		System.out.println("Cercle 1 - Surface: " + cercle1.surface());
		System.out.println("Cercle 2 - Perimetre: " + cercle2.perimetre());
		System.out.println("Cercle 2 - Surface: " + cercle2.surface());
	}
}
