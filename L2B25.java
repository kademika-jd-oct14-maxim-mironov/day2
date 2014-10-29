package day2;

public class L2B25 {

	public static void main(String[] args) {

		System.out.println(getQuadrant("a", "1"));

		
		
	}
	
	static String getQuadrant (String v, String h){
	
		int hor = Integer.valueOf(h);
		int vert = 1;
		
		if (v.equals("b")){
			vert = 2;
		} else if (v.equals("c")){
			vert = 3;
		} else if (v.equals("d")){
			vert = 4;
		} else if (v.equals("e")){
			vert = 5;
		} else if (v.equals("f")){
			vert = 6;
		} else if (v.equals("g")){
			vert = 7;
		} else if (v.equals("h")){
			vert = 8;
		}
		
		
		return (vert - 1) * 64 + "_" + (hor -1) * 64;	
	}
	

}