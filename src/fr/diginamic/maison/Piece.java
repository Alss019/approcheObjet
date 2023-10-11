package fr.diginamic.maison;

public abstract class Piece {

	double superficie;
	int etage;
	
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	} 
    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }
}
