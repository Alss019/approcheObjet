package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville>{

	private int critere=0;
	
	
	public ComparatorHabitant(int critere) {
		this.critere = critere;
	}

	@Override
	public int compare(Ville v1, Ville v2) {
		if(critere == 0) {
			if(v1.getNbHabitant() < v2.getNbHabitant()) {
				return 1;
			}
			else if(v1.getNbHabitant() > v2.getNbHabitant())  {
				return -1;
			}
			else {
				return 0;
			}
		}
		else {
			return v1.getNom().compareTo(v2.getNom());		
		}
	}
	
}
