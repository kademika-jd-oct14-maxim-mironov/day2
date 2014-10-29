package day2;

public class L2B21 {

	public static void main(String[] args) {

		System.out.println(min(25, 15, -21));
	}
	
	static int min(int a, int b, int c) {
		
		if (a > b & a > c){
			return a;
		} 
		
		if (b > a & b > c){ 
			return b;
			}
		
		if (c > a & c > b){	
			return c;
			} 	
		
		return 0;

	}

}
