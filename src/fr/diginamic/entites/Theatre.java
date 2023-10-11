package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int totalClientsInscrits;
    private double recetteTotale;

    // Constructeur
    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
    }

    // Méthode pour inscrire des clients
    public void inscrire(int nombreClients, double prixPlace) {
        if (totalClientsInscrits + nombreClients <= capaciteMax) {
            totalClientsInscrits += nombreClients;
            recetteTotale += nombreClients * prixPlace;
        } else {
            System.out.println("La capacité maximale du théâtre est atteinte. Impossible d'inscrire plus de clients.");
        }
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getTotalClientsInscrits() {
        return totalClientsInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }
}
