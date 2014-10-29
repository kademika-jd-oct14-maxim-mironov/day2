package day2;

public class L2HW5 {

	public static void main(String[] args) {

		printNumbers(-500, 1000);

	}
	
	static void printNumbers(int i, int n){
				
		while (i < n){
		n++;
		System.out.println(n);
		System.out.println(i);
		
		n = i / n;
		}
		
		}
		
	}

