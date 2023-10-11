package sets;

import java.util.HashSet;

public class TestSetPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Pays> liste = new HashSet<>();
		
		liste.add(new Pays("USA", 323000000, 70248.63));
		liste.add(new Pays("France", 68042591, 43658.98));
		liste.add(new Pays("Allemagne", 83240000, 51203.55));
		liste.add(new Pays("UK", 66022000, 46510.28));
		liste.add(new Pays("Italie", 60300000, 35657.50));
		liste.add(new Pays("Japon", 125700000, 39312.66));
		liste.add(new Pays("Chine", 1300000000, 12556.33));
		liste.add(new Pays("Russie", 125700000, 12194.78));
		liste.add(new Pays("Inde", 1428600000, 2256.59));
		
        Pays pibHabMax = null;
        double pibHabiMax = 0;
        
        for(Pays pays : liste) {
        	if(pays.getPibParHab() > pibHabiMax) {
        		pibHabiMax = pays.getPibParHab();
        		pibHabMax = pays;
        	}
        }
        System.out.println(pibHabMax.getNom());
        
        Pays pibMax = null;
        double pibPaysMax = 0;
        for(Pays pays : liste) {
        	if(pays.getPibTotal() > pibPaysMax) {
        		pibHabiMax = pays.getPibTotal();
        		pibMax = pays;
        	}
        }
        
        System.out.println(pibMax.getNom());

        
        Pays pibMin = null;
        double pibPaysMin = pibMax.getPibTotal();
        
        for(Pays pays : liste) {
        	if(pays.getPibTotal() < pibPaysMin) {
        		pibPaysMin = pays.getPibTotal();
        		pibMin = pays;
        	}

        }
        System.out.println(pibMin.getNom());
        
        for(Pays pays: liste){
        	if(pays.pibParHab == pibMin.pibParHab) {
        		pays.setNom(pays.getNom().toUpperCase());
        	}
        }
        System.out.println(liste);
		
	}

}
