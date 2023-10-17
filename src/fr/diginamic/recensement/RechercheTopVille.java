package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

public class RechercheTopVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		Collections.sort(recensement.getVilles(), new ComparatorPopulationVille());

		for(int i=0;i<10;i++) {
			System.out.println((i+1) + "-"+recensement.getVilles().get(i));
		}
	}

}
