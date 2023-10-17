package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import listes.Ville;

public abstract class VilleComparator implements Comparator<Ville> {

    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();

        // Ajoutez des villes à la liste
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne,", 47800));
        villes.add(new Ville("Lyon,", 484000));
        villes.add(new Ville("Foix,", 9700));
        villes.add(new Ville("Narbonne,", 53400));

        // Triez la liste
//        Collections.sort(villes);
//        Tri par le nombre d'habitant
//        Collections.sort(villes, new ComparatorHabitant(0));
//        Tri par le nom des villes
        Collections.sort(villes, new ComparatorNom());

        // Affichez les villes triées
        for (Ville ville : villes) {
            System.out.println(ville.getNom() + " - Population : " + ville.getNbHabitant());
        }
        
    }

}
