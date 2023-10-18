package fr.diginamic.jdr;

import java.util.Random;

public class Loup {

	int force;
	int pv;
	
	public Loup() {
		Random random =new Random();
		this.force = random.nextInt(3)+5;
		this.pv = random.nextInt(5)+5;
	}

	@Override
	public String toString() {
		return "Loup [force=" + force + ", pv=" + pv + "]";
	}

	/** Getter
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/** Setter
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/** Getter
	 * @return the pv
	 */
	public int getPv() {
		return pv;
	}

	/** Setter
	 * @param pv the pv to set
	 */
	public void setPv(int pv) {
		this.pv = pv;
	}
	
}
