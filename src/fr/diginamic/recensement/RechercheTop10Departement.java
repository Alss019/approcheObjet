package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class RechercheTop10Departement extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		HashMap<String, Integer> comptage = new HashMap<>();
		for (Ville v: recensement.getVilles()) {
			Integer compteur = comptage.getOrDefault(v.getCodeDep(), 0);
			compteur += v.getPopulationTotale();
			comptage.put(v.getCodeDep(), compteur);
		}
		
		// Création d'une liste de département
				ArrayList<Departement> listeDep = new ArrayList<>();
				for (Entry<String, Integer> m: comptage.entrySet()) {
					listeDep.add(new Departement(m.getKey(), m.getValue()));
				}
				
				// Tri de la liste de région
				Collections.sort(listeDep, new ComparatorPopulationDepartement());
				
				// Affichage des 10 régions les plus peuplées
				System.out.println("\n/////////////////////////////////////////\n");
				System.out.println("Les 10 départements les plus peuplées sont :");
				System.out.println("-----------------------------------------");
				for (int i = 0; i<10; i++) {
					System.out.println((i+1) + " - " + listeDep.get(i));
				}
	}

}
