package sets;


import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> liste = new HashSet<>();
		liste.add("USA");
		liste.add("France");
		liste.add("Allemagne");
		liste.add("UK");
		liste.add("Italie");
		liste.add("Japon");
		liste.add("Chine");
		liste.add("Russie");
		liste.add("Inde");
		
		String ville ="";
		int lettreMax = 0;
		for(String villeLettre : liste) {
			int nbrLettre = villeLettre.length();
			if(nbrLettre >lettreMax) {
				lettreMax = nbrLettre;
				
				ville = villeLettre;
			}
		}
		System.out.println("Ville avec le plus de lettres : "+ ville);
		
		Iterator<String> iter = liste.iterator();
		while(iter.hasNext()) {
			String city = iter.next();
			if(city == ville) {
				iter.remove();
			}
		}
		System.out.println(liste);
	}

}
