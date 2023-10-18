package fr.diginamic.testenumeration;

import java.util.Scanner;

public class TestEnumetation {

	public static void main(String[] args) {
		//Boucle qui affiche toute les saisons 
		Saison[] saisons = Saison.values();
		for (Saison s : saisons) {
			System.out.println("String nom = " + s.name());
		}
        // Chercher et afficher le libellé de l'instance de Saison dont le nom est "ETE"
        String nom = "ETE";
        Saison saisonETE = Saison.valueOf(nom);
        System.out.println("Le libellé de la saison " + nom + " est : " + saisonETE.getLibelle());
        
        // Scanner qui prend un libeler et qui recherche si le libelle exciste et l'affiche
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrez la saison que vous souhaiter selectionner :");
        String choix = scanner.nextLine();
        
        Saison saisonHiver = Saison.getSaisonByLibelle(choix);
        
        if( saisonHiver != null) {
            System.out.println("Saison trouvée avec le libellé '" + choix + "': " + saisonHiver);
        } else {
            System.out.println("Aucune saison trouvée avec le libellé '" + choix + "'");
        }
        
	}

}
