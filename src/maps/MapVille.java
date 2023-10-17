package maps;

import java.util.Comparator;
import java.util.HashMap;

import listes.Ville;

public class MapVille implements Comparator<Ville>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Ville> map = new HashMap<>();
		Ville ville1 = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Carcassonne,", 47800);
		Ville ville3 = new Ville("Foix,", 9700);
		Ville ville4= new Ville("Lyon,", 484000);
		Ville ville5 = new Ville("Narbonne,", 53400);
		
		map.put(ville1.getNom(), ville1);
		map.put(ville2.getNom(), ville2);
		map.put(ville3.getNom(), ville3);
		map.put(ville4.getNom(), ville4);
		map.put(ville5.getNom(), ville5);

		float habitant = ville1.getNbHabitant();
		String ville = null;
		
		
		for(Ville villes : map.values()) {
			if(villes.getNbHabitant() < habitant) {
				habitant = villes.getNbHabitant();
				ville = villes.getNom();
			}
		}
		map.remove(ville);
		
		for (String cle: map.keySet()) {
			System.out.println(cle);
		}
		
		
	}

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
