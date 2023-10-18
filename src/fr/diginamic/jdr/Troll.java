package fr.diginamic.jdr;

import java.util.Random;

public class Troll {

	int force;
	int pv;
	
	public Troll() {
		Random random =new Random();
		this.force = random.nextInt();
		this.pv = random.nextInt();
	}
}
