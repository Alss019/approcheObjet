package listes;

import java.util.ArrayList;

import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcassonne,", 47800));
		liste.add(new Ville("Narbonne,", 53400));
		liste.add(new Ville("Lyon,", 484000));
		liste.add(new Ville("Foix,", 9700));
		liste.add(new Ville("Pau,", 77200));
		liste.add(new Ville("Marseille,",850700));
		liste.add(new Ville("Tarbes", 40600));
		
        Ville villeMax = null;
        float populationMax = 0;
        
        for (Ville ville : liste) {
            if (ville.getNbHabitant() > populationMax) {
                populationMax = ville.getNbHabitant();
                villeMax = ville;
            }
        }
        System.out.println("La ville la plus peuplé " + villeMax.nbHabitant);
        
        Ville villeMin = null;
        float populationMin = liste.get(0).getNbHabitant();
        for (Ville ville : liste) {
            if (ville.getNbHabitant() < populationMin) {
            	populationMin = ville.getNbHabitant();
            	villeMin = ville;
            }
        }
        
        Iterator<Ville> iter = liste.iterator();
        while(iter.hasNext()) {
        	Ville ville = iter.next();
        	if(ville == villeMin) {
        		iter.remove();
        	}
        }
        for (Ville ville : liste) {
        	if(ville.nbHabitant < 100000) {

        		ville.setNom(ville.getNom().toUpperCase());
        	}
        }
        System.out.println("La ville la plus peuplé " + liste);
	}


}
