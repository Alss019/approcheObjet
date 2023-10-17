package fr.diginamic.recensement;

public class Departement {

	private String codeDep;
	private int  populationTotale;
	
	public Departement(String codeDep, int populationTotal) {
		super();
		this.codeDep = codeDep;
		this.populationTotale = populationTotal;
	}

	/**
	 * @return the codeDep
	 */
	public String getCodeDep() {
		return codeDep;
	}

	/**
	 * @return the populationTotal
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}
	
	@Override
	public String toString() {
		return codeDep + " (" + populationTotale + " hab.)";
	}
	
}
