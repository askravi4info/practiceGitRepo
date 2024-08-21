package javaBasics;

public class LoopsDemo {

	public static void main(String[] args) {


//		while
		int i = 0;
		while(i<5) {
			System.out.println(i + " is less than 5 - WHILE");
			i = i+1;
		}
		
//		do While
		int y=0;
		do {
			System.out.println(y + " is less than 5 - DO WHILE");
			y = y+1;	
		} while(y<5);
		
		
//		for
		for (int z = 0; z < 5; z++) {
			  System.out.println("Using FOR loop - " +z);
			}

//		for each
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int[] favNum = {1,4,8,9,44};

		for (String k : cars) {
		  System.out.println(k);
		}

		for (int k : favNum) {
		  System.out.println(k);
		}

		
		
		
		
	}

}
