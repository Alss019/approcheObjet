package fr.diginamic.operation;

public class CalculMoyenne {
    private double[] tableau;
    private int taille;
    private int capacite;

    public CalculMoyenne(int capaciteInitiale) {
        capacite = capaciteInitiale;
        tableau = new double[capacite];
        taille = 0;
    }

    public void ajout(double nombre) {
        if (taille == capacite) {
            capacite *= 2; // Double la capacité si le tableau est plein
            double[] nouveauTableau = new double[capacite];
            System.arraycopy(tableau, 0, nouveauTableau, 0, taille);
            tableau = nouveauTableau;
        }
        tableau[taille] = nombre;
        taille++;
    }

    public double calcul() {
        if (taille == 0) {
           System.out.println("Le tableau est vide.");
        }
        double somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        return somme / taille;
    }
}