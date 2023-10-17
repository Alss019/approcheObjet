package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pays> liste= new ArrayList<>();
		
		Pays france = new Pays("France", 6500000, "Europe");
		
		
		liste.add(france);
		liste.add(new Pays("Allemagne", 8000000, "Europe"));
		liste.add(new Pays("Belgique", 1000000, "Europe"));
		liste.add(new Pays("Russie", 15000000, "Asie"));
		liste.add(new Pays("Chine", 1400000000, "Asie"));
		liste.add(new Pays("Indonésie", 22000000, "Oceanie"));
		liste.add(new Pays("Australie", 2000000, "Oceanie"));
		
		System.out.println();
        HashMap<String, Integer> map = new HashMap<>();

        for (Pays pays : liste) {
            String continent = pays.getContinent();

            if (!map.containsKey(continent)) {
            	map.put(continent, 1);
            } else {
                int count = map.get(continent);
                map.put(continent, count + 1);
            }
        }


        for (String continent : map.keySet()) {
            int count = map.get(continent);
            System.out.println("Continent : " + continent + " - Nombre de pays : " + count);
        }
		
	}

}
