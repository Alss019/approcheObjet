package fr.diginamic.essais;
import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison(10);

        // Ajoutez des pièces à la maison
        maison.ajouterPiece(new Chambre(20.0, 0));
        maison.ajouterPiece(new Cuisine(15.0, 0));
        maison.ajouterPiece(new Salon(30.0, 1));
        maison.ajouterPiece(new SalleDeBain(10.0, 1));
        maison.ajouterPiece(new Wc(5.0, 1));

        // Vérifiez les fonctionnalités
        System.out.println("Superficie totale de la maison : " + maison.superficieTotale());
        System.out.println("Superficie du 1er étage : " + maison.superficieEtage(1));

        // Ajoutez une pièce nulle
        maison.ajouterPiece(null);
    }
}