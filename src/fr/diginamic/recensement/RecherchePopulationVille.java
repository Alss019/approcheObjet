package fr.diginamic.recensement;

import java.util.Scanner;

class RecherchePopulationVille extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("\n================================================\n");
        System.out.print("Entrez le nom de la ville : ");
        String nomVille = scanner.nextLine();
        boolean isVilleTrouvee = false;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNom().equalsIgnoreCase(nomVille)) {
                System.out.println("Population de " + nomVille + " : " + ville.getPopulationTotale()+ " habitants\n");
                isVilleTrouvee = true;
            }
        }
        if (isVilleTrouvee == false) {
			System.out.println("\nLa ville demandée n'existe pas !");
		}
    }
}
