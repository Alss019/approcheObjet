package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {
	int force;
	int pv;
	int score;
	
	public Personnage() {
		Random random = new Random();
		this.force = random.nextInt(7)+12;
		this.pv = random.nextInt(31)+20;
		this.score = 0;
	}
	
	@Override
	public String toString() {
		return "Personnage [force=" + force + ", pv=" + pv + ", score=" + score + "]";
	}

	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}
	/**
	 * @return the pv
	 */
	public int getPv() {
		return pv;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	
}
