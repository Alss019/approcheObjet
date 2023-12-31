package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RechercheTopVilleDep extends MenuService{
	
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création de la liste des villes du département recherché
		ArrayList<Ville> villes = new ArrayList<>();
		System.out.println("\n================================================\n");
		System.out.println("Saisir ci-dessous le numéro du département recherché :");
		String depRecherche = scanner.next();
		for (Ville v: recensement.getVilles()) {
			if (v.getCodeDep().equalsIgnoreCase(depRecherche)) {
				villes.add(v);
			}
		}
		if (villes.size()>0) {
			// Tri par ordre de population
			Collections.sort(villes, new ComparatorPopulationVille());
			
			System.out.println("\n================================================\n");
			System.out.println(" Les 10 villes les plus peuplées du département " + depRecherche + " sont :");
			System.out.println("\n================================================\n");
			for (int i = 0; i<10; i++) {
				System.out.println((i+1) + " - " + villes.get(i));
			}
			
		} else {
			System.out.println("\nLe département demandé n'existe pas !");
		}
		System.out.println("\n================================================\n");

		
	}

}
