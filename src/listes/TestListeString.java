package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {
	
	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		
		String ville ="";
		int lettreMax = 0;
		for(String villeLettre : liste) {
			int nbrLettre = villeLettre.length();
			if(nbrLettre >lettreMax) {
				lettreMax = nbrLettre;
				
				ville = villeLettre;
			}
		}
		System.out.println("Ville avec le plus de lettre : "+ ville);
		
		for(int i=0;i<liste.size();i++){
			liste.set(i, liste.get(i).toUpperCase());
		}
		System.out.println(liste);
		
		Iterator<String> iter = liste.iterator();
		while(iter.hasNext()) {
			String city = iter.next();
			if(city.charAt(0) == 'N') {
				iter.remove();
			}
		}
		System.out.println("Liste sans les ville qui on comme premiere lettre N : \n"+liste);
	}
}
