package fr.diginamic.banque.entites;

public abstract class Operation {
	protected String date;
	protected double montant;
	

	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	@Override
	public String toString() {
		return "Operation Detail " + date + " \nMontant :" + montant + " \nType Opération :" +getType();
	}
	
	
	protected abstract String getType();

	protected abstract double totalSolde(double total);
}
