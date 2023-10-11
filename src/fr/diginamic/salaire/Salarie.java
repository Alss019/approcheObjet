package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	
	double salaireMen;
	
	public Salarie(String nom, String prenom, double salaireMen) {
		super(nom, prenom);
		this.salaireMen = salaireMen;
	}
	@Override
	public double getSalaire() {
		return salaireMen;
	}

}
