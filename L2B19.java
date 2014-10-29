package day2;

public class L2B19 {

	public static void main(String[] args) {

		System.out.println(min(25, 36, -21));

	}
	
	static int min(int a, int b, int c) {
		
		if (a > b & a > c){
		return a;
		
		} else if (b > a & b > c){ 
		  return b;
		  
			} else if (c > a & c > b){	
			  return c;
			  } 
		
	return 0;
	}

}
