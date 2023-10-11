package fr.diginamic.maison;

public class Maison {

	private Piece[] pieces;
	private int nombrePieces;
	
    public Maison(int capaciteMax) {
        pieces = new Piece[capaciteMax];
        nombrePieces = 0;
    }
    
	public void ajouterPiece(Piece piece) {
		if(piece == null) {
			System.out.println("Impossible de rajouter une piece vide");
			return;
		}
		pieces[nombrePieces] = piece;
		nombrePieces ++;
	}
	
    public double superficieTotale() {
        double superficieTotale = 0.0;
        for (int i = 0; i < nombrePieces; i++) {
            superficieTotale += pieces[i].getSuperficie();
        }
        return superficieTotale;
    }
    public double superficieEtage(int etageRecherche) {
        double superficieEtage = 0.0;
        for (int i = 0; i < nombrePieces; i++) {
            if (pieces[i].getEtage() == etageRecherche) {
                superficieEtage += pieces[i].getSuperficie();
            }
        }
        return superficieEtage;
    }

}
