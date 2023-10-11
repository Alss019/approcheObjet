package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation[] ope = new Operation[4];
	
		 ope[0] = new Credit("21/02/2023", 100.0);
		 ope[1] = new Credit("25/03/2023", 500.0);
		 ope[2] = new Debit("15/04/2023", 500.0);
		 ope[3] = new Debit("22/03/2023", 100.0);
		
		 double total = 0;
		 
		 for(int i=0; i<ope.length; i++) {
			 total = ope[i].totalSolde(total);
			 System.out.println(ope[i]);
			 System.out.println(ope[i].totalSolde(total));
		 }
		 System.out.println(total);
		 
		  
		
		
	} 

}
