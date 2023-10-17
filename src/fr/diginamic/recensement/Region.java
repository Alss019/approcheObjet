package fr.diginamic.recensement;

public class Region {

	private String nomRegion;
	private int populationTotale;
	
	public Region(String nomRegion, int populationTotale) {
		super();
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}

	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	@Override
	public String toString() {
		return nomRegion +  " (" + populationTotale + " hab.)";
	}
	
	
}
