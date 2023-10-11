package fr.diginamic.essais;

import fr.diginamic.operation.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne moyenne = new CalculMoyenne(10);

        // Test 1 : Ajout de quelques nombres
        moyenne.ajout(10.0);
        moyenne.ajout(20.0);
        moyenne.ajout(30.0);

        double moyenne1 = moyenne.calcul();
        System.out.println("Moyenne 1 : " + moyenne1);

        // Test 2 : Ajout de plus de nombres
        for (double i = 1.0; i <= 100.0; i++) {
        	moyenne.ajout(i);
        }
        
        double moyenne2 = moyenne.calcul();
        System.out.println("Moyenne 2 : " + moyenne2);
    }
}






