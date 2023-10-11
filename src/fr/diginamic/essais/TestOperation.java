package fr.diginamic.essais;

import fr.diginamic.operation.Operations;


public class TestOperation {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        char addition = '+';
        char soustraction = '-';
        char multiplication = '*';
        char division = '/';

        double resultatAddition = Operations.calcul(a, b, addition);
        double resultatSoustraction = Operations.calcul(a, b, soustraction);
        double resultatMultiplication = Operations.calcul(a, b, multiplication);
        double resultatDivision = Operations.calcul(a, b, division);

        System.out.println("Résultat de l'addition : " + resultatAddition);
        System.out.println("Résultat de la soustraction : " + resultatSoustraction);
        System.out.println("Résultat de la multiplication : " + resultatMultiplication);
        System.out.println("Résultat de la division : " + resultatDivision);
    }
}
