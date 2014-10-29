package day2;

public class L2B27 {

	public static void main(String[] args) {

		printCoordinates("f", "5");
		System.out.println(getQuadrant("f", "5"));
	}
	
	/**
	 * - TANKS
	 */
	
	static void printCoordinates(String v, String h){
		String pixels = getQuadrant(v, h).replace("_", "px; ");
		pixels = v + h + ":" + "(" + pixels + "px" + ")";
		
		System.out.println(pixels);
		}

	static String getQuadrant(String v, String h){
		int hor = Integer.valueOf(h);
		int vert = 1;
		
		if (v.equals("a")){
			vert = 1;
		} else if (v.equals("b")){
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
		} else if (v.equals("i")){
			vert = 9;
		}
		
		return (vert -1 ) * 64 + "_" + (hor - 1) * 64;
			
		}



	}
	



/*

static void printCoordinates(String v, String h){
		String coord = getQuadrant(v, h);
		coord = coord.replace("_", "px; ") + "px";
		coord = "(" + coord + ")";
		
		System.out.println(v + h + ":" + coord);
		}
*/