package fr.diginamic.chaines;

import fr.diginamic.entites.Salaire;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println(chaine.length());
		
		System.out.println(chaine.indexOf(";"));
		
		String sub = chaine.substring(0 , 6);
		
		System.out.println(sub.toUpperCase());
		System.out.println(sub.toLowerCase());
		
		String[] mots = chaine.split(";");
		System.out.println(mots[1]);
        for (String mot : mots) {
            System.out.println(mot);
        }
        
        String nom = mots[0];
        String prenom = mots[1];
        String salaireStr = mots[2].replace(" ", "");
        double salaire = Double.parseDouble(salaireStr);
        
        Salaire sal = new Salaire(nom, prenom, salaire);
        
        System.out.println(sal);
	}

}
