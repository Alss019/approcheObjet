package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorNom implements Comparator<Ville>{

	@Override
	public int compare(Ville v1, Ville v2) {
		return v1.getNom().compareTo(v2.getNom());
	}
}
