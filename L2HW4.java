package day2;

public class L2HW4 {

	public static void main(String[] args) {

		start(5+5);

	}
	
	static void start(int number){
		
		if (number < 0){
			System.out.println("Start failed");
		
		} else if (number != 0){
			while (number != 0){
			number--;
			System.out.println(number);	
		} 
		}
		
		if (number == 0){
			System.out.println("Go!");
		}


	}

}