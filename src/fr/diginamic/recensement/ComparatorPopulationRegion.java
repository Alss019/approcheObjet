package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorPopulationRegion implements Comparator<Region>{

	@Override
	public int compare(Region r1, Region r2) {
		if(r1.getPopulationTotale() > r2.getPopulationTotale()) {
			return -1;
		}
		else if(r1.getPopulationTotale() < r2.getPopulationTotale()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
