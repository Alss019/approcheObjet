package utils;

public class TestMethodeStatic {

	static int maxNum( int a, int b) {
		if(a >b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine ="12";
		int result = Integer.parseInt(chaine);
		System.out.println(result);
		int a = 20;
		int b = 30;
		System.out.println(Integer.max(a, b));


	}

}
