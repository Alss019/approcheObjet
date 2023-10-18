package fr.diginamic.jdr;

import java.util.Scanner;

public class Combat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personnage personnage = null;

        while (true) {
            System.out.println("Menu du jeu :");
            System.out.println("1. Créer le personnage");
            System.out.println("2. Combattre une créature");
            System.out.println("3. Afficher score");
            System.out.println("4. Sortir");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    personnage = new Personnage();
                    System.out.println("Personnage créé !");
                    System.out.println(personnage);
                    break;
                case 2:
                    if (personnage != null && personnage.getPv() > 0) {
                    	if(personnage.score  == 0) {
                    		Loup loup = new Loup();
                    		System.out.println(loup);
                    	}if(personnage.score  == 1) {
                    		Gobelin gobelin = new Gobelin();
                    	}if(personnage.score == 3) {
                    		Troll troll = new Troll();
                    	}
                    } else {
                        System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.getScore() + " points. Veuillez créer un nouveau personnage.");
                    }
                    break;
                case 3:
                    if (personnage != null) {
                        System.out.println("Score : " + personnage.getScore());
                    } else {
                     System.out.println("Aucun personnage créé.");
                    }
                    break;
                case 4:
                    System.out.println("Merci d'avoir joué !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
