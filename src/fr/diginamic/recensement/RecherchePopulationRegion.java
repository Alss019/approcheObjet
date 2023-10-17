package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création de la liste des villes de la region recherché
		ArrayList<Ville> villes = new ArrayList<>();
		System.out.println("\n================================================\n");
		System.out.println("Saisir ci-dessous le nom de la region recherché :");
		String regionRecherche = scanner.next();
		for (Ville v: recensement.getVilles()) {
			if (v.getNomRegion().equalsIgnoreCase(regionRecherche)) {
				villes.add(v);
			}
		}
		if (villes.size()>0) {
			int populationTotale = 0;
			for (Ville v: villes) {
				populationTotale += v.getPopulationTotale();
			}
			System.out.println("\nPopulation totale de la région " + regionRecherche + " : "+ populationTotale  + " habitants");
		} else {
			System.out.println("\nLe département demandé n'existe pas !");
		}
		System.out.println("\n================================================\n");
	}
}
