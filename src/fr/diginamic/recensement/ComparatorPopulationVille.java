package fr.diginamic.recensement;
import java.util.Comparator;

public class ComparatorPopulationVille implements Comparator<Ville> {
	
	public int compare(Ville v1, Ville v2) {
		if (v1.getPopulationTotale() > v2.getPopulationTotale()) {
			return -1;
		}
		else if (v1.getPopulationTotale() < v2.getPopulationTotale()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}