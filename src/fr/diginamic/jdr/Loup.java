package fr.diginamic.jdr;

import java.util.Random;

public class Loup {

	int force;
	int pv;
	
	public Loup() {
		Random random =new Random();
		this.force = random.nextInt();
		this.pv = random.nextInt();
	}
	
}
