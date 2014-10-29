package day2;

public class L2B23 {

	public static void main(String[] args) {

		System.out.println(isSpring(3));

	}
	
	static int isSpring(int month){
		
		if (month > 12 || month < 0){
			return -1;
		}
		
		if (month < 3 || month > 5){
			return 0;
		} else {
			return 1;
		}
		
	}

}
