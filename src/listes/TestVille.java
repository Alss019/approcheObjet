package listes;

import java.util.ArrayList;

import java.util.Iterator;

import utils.ValidationException;
import utils.Valide;

public class TestVille {

	public static void main(String[] args)
			throws ValidationException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		ArrayList<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 3430000));
		liste.add(new Ville("Carcassonne", -1));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", -1));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", -1));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));


		for (Ville ville : liste) {
			try {
				Valide.valider(ville);
				System.out.println(ville);
			} catch (ValidationException e) {
				System.out.println("Erreur de validation : " + e.getMessage());
			}
		}

		Ville villeMax = null;
		float populationMax = 0;

		for (Ville ville : liste) {
			if (ville.getNbHabitant() > populationMax) {
				populationMax = ville.getNbHabitant();
				villeMax = ville;
			}
		}
		System.out.println("La ville la plus peuplé est " + villeMax.getNom() + " avec " + villeMax.getNbHabitant());

		Ville villeMin = null;
		float populationMin = liste.get(0).getNbHabitant();
		for (Ville ville : liste) {
			if (ville.getNbHabitant() < populationMin) {
				populationMin = ville.getNbHabitant();
				villeMin = ville;
			}
		}

		Iterator<Ville> iter = liste.iterator();
		while (iter.hasNext()) {
			Ville ville = iter.next();
			if (ville == villeMin) {
				iter.remove();
			}
		}

	}

}
