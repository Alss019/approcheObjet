package listes;

public enum EnumContinent {

	EUROPE("Europe"),
	ASIE("Asie"),
	OCEANIE("Oceanie"),
	AMERIQUE("Amerique"),
	AFRIQUE("Afrique");
	
	private String libelle;
	
	EnumContinent(String libelle){
		this.libelle = libelle;
	}
	
	  public String getLibelle() {
	        return libelle;
	    }

}
