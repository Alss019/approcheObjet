package chaine;

public class TestStringBuilder {

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder();

		long debut = System.currentTimeMillis();

		for (int i = 1; i <= 100000; i++) {
			stringBuilder.append(i);
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println("En utilisant StringBuilder");
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut) + "ms");
		System.out.println("-------------------------");

		String string = "";
		debut = System.currentTimeMillis();
		
		for (int i = 1; i <= 100000; i++) {
			string += i;
		}
		
		fin = System.currentTimeMillis();
		System.out.println("En utilisant pas StringBuilder");
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut) + "ms");
	}

}
