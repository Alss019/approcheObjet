package listes;

import java.util.ArrayList;
import java.util.Collections;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> liste = new ArrayList<>();
		for( int i=1 ; i<101 ; i++) {
			liste.add(i);
		}
		System.out.println("La longueur du tableau est : "+liste.size());
		for(int i=0; i<liste.size();i++) {
			int num = liste.get(i);
			System.out.println(num);
		}
		System.out.println(Collections.max(liste));
	}

}
