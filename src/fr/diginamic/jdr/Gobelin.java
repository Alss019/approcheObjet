package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin {

	int force;
	int pv;
	
	public Gobelin() {
		Random random =new Random();
		this.force = random.nextInt();
		this.pv = random.nextInt();
	}
}
