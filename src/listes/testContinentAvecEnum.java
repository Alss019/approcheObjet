package listes;

import java.util.ArrayList;

public class testContinentAvecEnum {

	public static void main(String[] args) {
		
		ArrayList<Ville> villes = new ArrayList<>();
		
		villes.add(new Ville("Paris", 2206488, EnumContinent.EUROPE));
        villes.add(new Ville("New York", 8175133, EnumContinent.AMERIQUE));
        villes.add(new Ville("Paris", 2206488, EnumContinent.EUROPE));
        villes.add(new Ville("Pékin", 21720000, EnumContinent.ASIE));
        villes.add(new Ville("Moscou", 11979529, EnumContinent.EUROPE));
        villes.add(new Ville("Berlin", 3759495, EnumContinent.EUROPE));
        villes.add(new Ville("Sydney", 4627345, EnumContinent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 12106920, EnumContinent.AMERIQUE));
        villes.add(new Ville("Dakar", 1146054, EnumContinent.AFRIQUE));
        
        for (Ville ville : villes) {
            System.out.println(ville);
        }
	}

}
