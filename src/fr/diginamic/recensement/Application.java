package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/corentin/Desktop/recensement.csv");
        Recensement recensement = RecensementFactory.createRecenssement(path);
        Scanner scanner = new Scanner(System.in);
        MenuService rechercheVille = new RecherchePopulationVille();
        int choix = 0;
 
        while(choix != 9){
        	afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    rechercheVille = new RecherchePopulationVille();
                    rechercheVille.traiter(recensement, scanner);
                    break;
                case 2:
                	rechercheVille = new RecherchePopulationDepartement();
                	rechercheVille.traiter(recensement, scanner);
                	break;
                case 3:
                	rechercheVille = new RecherchePopulationRegion();
                	rechercheVille.traiter(recensement, scanner);
                	break;
                case 4:
                	rechercheVille = new RechercheTop10Departement();
                	rechercheVille.traiter(recensement, scanner);
                	break;
                case 5:
                	rechercheVille = new RechercheTop10Region();
                	rechercheVille.traiter(recensement, scanner);
                	break;
                case 6:
                	rechercheVille = new RechercheTopVilleDep();
                	rechercheVille.traiter(recensement, scanner);
                	break;
                case 7:
                	rechercheVille = new RechercheTopVilleRegion();
                	rechercheVille.traiter(recensement, scanner);
                	break;
                case 8:
                	rechercheVille = new RechercheTopVille();
                	rechercheVille.traiter(recensement, scanner);
                	break;
                case 9:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

        }

      
    }

    public static void afficherMenu() {
        System.out.println("Menu :");
        System.out.println("1. Population d’une ville donnée");
        System.out.println("2. Population d’un département donné");
        System.out.println("3. Population d’une région donnée");
        System.out.println("4. Afficher les 10 régions les plus peuplées");
        System.out.println("5. Afficher les 10 départements les plus peuplés");
        System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
        System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
        System.out.println("8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("9. Sortir");
        System.out.print("Entrez votre choix : ");
    }
}

