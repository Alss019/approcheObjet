package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

		double taux;
		
	public CompteTaux(String numCompte, double soldeCompte, double taux) {
		super(numCompte, soldeCompte);
		this.taux = taux;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Taux de remuneration " + taux + "% \n" + super.toString();
	}

}
