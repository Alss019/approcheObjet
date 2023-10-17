package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Nice", 343000);
		Ville v3 = v1;
		
		if(v1.equals(v2)) {
			System.out.println("Les deux villes sont  identiques, retourne :" + v1.equals(v2));
		}else {
			System.out.println("Les deux villes ne sont pas identiques, retourne :" + v1.equals(v2));
		}

        // Utilisation de l'opérateur == pour comparer les objets.
        System.out.println("Opérateur == entre ville1 et ville2 : " + (v1 == v2)); 

        System.out.println("Opérateur == entre ville1 et ville3 : " + (v1 == v3)); 

        
	}

}
