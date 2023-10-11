package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

	int nbrJourM;
	double remuJ;
	
	 public Pigiste(String nom, String prenom, int nbrJourM, double remuJ) {
		super(nom, prenom);
		this.nbrJourM= nbrJourM;
		this.remuJ= remuJ;
	}

	@Override
	public double getSalaire() {
		return nbrJourM * remuJ;
	}
	
}
