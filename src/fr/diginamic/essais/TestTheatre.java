package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Mon Théâtre", 100);

        // Inscrivez des clients jusqu'à atteindre la capacité maximale
        theatre.inscrire(50, 25.0);
        theatre.inscrire(40, 25.0);

        // Tentative d'inscription de plus de clients que la capacité maximale
        theatre.inscrire(20, 25.0); // Affiche un message d'erreur

        // Affichez le total de clients inscrits et la recette totale de l'établissement
        System.out.println("Total de clients inscrits : " + theatre.getTotalClientsInscrits());
        System.out.println("Recette totale de l'établissement : " + theatre.getRecetteTotale());
    }
}