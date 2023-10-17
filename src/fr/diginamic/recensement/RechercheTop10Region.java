package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class RechercheTop10Region extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		HashMap<String, Integer> comptage = new HashMap<>();
		for (Ville v: recensement.getVilles()) {
			Integer compteur = comptage.getOrDefault(v.getNomRegion(), 0);
			compteur += v.getPopulationTotale();
			comptage.put(v.getNomRegion(), compteur);
		}
		
		// Création d'une liste de régions
				ArrayList<Region> listeReg = new ArrayList<>();
				for (Entry<String, Integer> m: comptage.entrySet()) {
					listeReg.add(new Region(m.getKey(), m.getValue()));
				}
				
				// Tri de la liste de région
				Collections.sort(listeReg, new ComparatorPopulationRegion());
				
				// Affichage des 10 régions les plus peuplées
				System.out.println("\n================================================\n");
				System.out.println("Les 10 régions les plus peuplées sont :");
				System.out.println("\n================================================\n");
				
				for (int i = 0; i<10; i++) {
					System.out.println((i+1) + " - " + listeReg.get(i));
				}
				System.out.println("\n================================================\n");
	}
}
