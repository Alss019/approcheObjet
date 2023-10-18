package listes;

import java.util.ArrayList;

public class testContinentAvecEnum {

	public static void main(String[] args) {
		
		ArrayList<Villes> villes = new ArrayList<>();
		
		villes.add(new Villes("Paris", 2206488, EnumContinent.EUROPE));
        villes.add(new Villes("New York", 8175133, EnumContinent.AMERIQUE));
        villes.add(new Villes("Paris", 2206488, EnumContinent.EUROPE));
        villes.add(new Villes("Pékin", 21720000, EnumContinent.ASIE));
        villes.add(new Villes("Moscou", 11979529, EnumContinent.EUROPE));
        villes.add(new Villes("Berlin", 3759495, EnumContinent.EUROPE));
        villes.add(new Villes("Sydney", 4627345, EnumContinent.OCEANIE));
        villes.add(new Villes("Sao Paulo", 12106920, EnumContinent.AMERIQUE));
        villes.add(new Villes("Dakar", 1146054, EnumContinent.AFRIQUE));
        
        for (Villes v : villes) {
            System.out.println(v);
        }
	}

}
