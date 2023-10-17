package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RechercheTopVilleRegion extends MenuService{
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création de la liste des villes de la region recherché
		ArrayList<Ville> villes = new ArrayList<>();
		System.out.println("\n================================================\n");
		System.out.println("Saisir ci-dessous le nom de la region recherché :");
		String regRecherche = scanner.next();
		for (Ville v: recensement.getVilles()) {
			if (v.getNomRegion().equalsIgnoreCase(regRecherche)) {
				villes.add(v);
			}
		}
		if (villes.size()>0) {
			// Tri par nombre de population
			Collections.sort(villes, new ComparatorPopulationVille());
			System.out.println("\n================================================\n");
			System.out.println("\nLes 10 villes les plus peuplées de la region " + regRecherche + " sont :");
			System.out.println("\n================================================\n");
			// Boucle qui affiche les 10 villes les plus peuplérs d'une region
			for (int i = 0; i<10; i++) {
				System.out.println((i+1) + " - " + villes.get(i));
			}
		} else {
			System.out.println("\nLa region demandé n'existe pas !");
		}
		System.out.println("\n================================================\n");
	}
}
