package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte c1 = new Compte("ABC123456", 5000);
		CompteTaux c2= new CompteTaux("DEF789456", 10000,10);
		
		
		Compte[] compte= new Compte[2];
		compte[0]= c1;
		compte[1]= c2;
		
		for(int i=0;i<compte.length;i++){
			System.out.println(compte[i] + "\n");
		}
		
	}

}
