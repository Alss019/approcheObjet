package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> liste = new ArrayList<>();
		
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		System.out.println("La éléments de la liste un par un : ");
		for(int num : liste) {
			System.out.println(num);
		}
		
		System.out.println("La éléments de la liste : "+ liste);
		
		System.out.println("La longueur du tableau est : "+ liste.size());
		System.out.println("La chiffre le plus grand est : "+ Collections.max(liste));
		
		
		Iterator<Integer> iter= liste.iterator();
		while(iter.hasNext()) {
			Integer num = iter.next();
			if(num.equals(Collections.min(liste))) {
				iter.remove();
			}
		}
		System.out.println("La liste avec le plus petit element supprimer : "+ liste);
	
		for(int i=0;i<liste.size();i++) {
			int num = liste.get(i);
			if(num < 0) {
				liste.set(i, num*-1);
			}
		}
		System.out.println("La liste avec que des chiffre positif : "+ liste);
		
	}

}
