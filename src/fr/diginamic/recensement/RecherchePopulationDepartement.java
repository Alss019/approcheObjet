package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService{
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création de la liste des villes du département recherché
		ArrayList<Ville> listeVille = new ArrayList<>();
		System.out.println("\n================================================\n");
		System.out.println("Saisir ci-dessous le numéro du département recherché :");
		String depRecherche = scanner.next();
		for (Ville v: recensement.getVilles()) {
			if (v.getCodeDep().equalsIgnoreCase(depRecherche)) {
				listeVille.add(v);
			}
		}
		if (listeVille.size()>0) {
			int populationTotale = 0;
			for (Ville v: listeVille) {
				populationTotale += v.getPopulationTotale();
			}
			System.out.println("\nPopulation totale du département " + depRecherche + " : "+ populationTotale  + " habitants\n");
		} else {
			System.out.println("\nLe département demandé n'existe pas !");
		}
	}
}
