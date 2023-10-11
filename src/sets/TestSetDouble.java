package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;



public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> sets = new HashSet<>();
		sets.add(1.5);
		sets.add(8.25);
		sets.add(-7.32);
		sets.add(13.3);
		sets.add(-12.45);
		sets.add(48.5);
		sets.add(0.01);
		
		for(double set: sets) {
			System.out.println(set);
		}
		double plusGrand = 0;
		
		for( double set : sets) {
			if(set > plusGrand) {
				plusGrand = set;
			}
		}
		System.out.println("Le plus grand élément : "+plusGrand);
		
		Iterator<Double> iter = sets.iterator();
		while(iter.hasNext()) {
			Double set = iter.next();
			if(set.equals(Collections.min(sets))) {
				iter.remove();
			}
		}
		System.out.println(sets);
		
	}

}
