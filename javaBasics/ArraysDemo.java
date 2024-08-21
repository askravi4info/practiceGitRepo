package javaBasics;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myIntArray = new int[10];
		
		myIntArray[0] = 100;
		myIntArray[1] = 200;
		myIntArray[3] = 300;
		
		System.out.println("Array Index 0 - " + myIntArray[0]);
		System.out.println("Array Index 1 - " + myIntArray[1]);
		System.out.println("Array Index 2 - " + myIntArray[2]);
		System.out.println("Array Index 3 - " + myIntArray[3]);
		
		String[] myStringArray = new String[10];

		myStringArray[0] = "Hai";
		myStringArray[1] = "Hello";
		myStringArray[3] = "Welcome";
		
		System.out.println("Array Index 0 - " + myStringArray[0]);
		System.out.println("Array Index 1 - " + myStringArray[1]);
		System.out.println("Array Index 2 - " + myStringArray[2]);
		System.out.println("Array Index 3 - " + myStringArray[3]);
		
		String[] myStringCars = {"BMW", "BENZ", "AUDI"};
		
		System.out.println("Array Index 0 - " + myStringCars[0]);
		System.out.println("Array Index 1 - " + myStringCars[1]);
		System.out.println("Array Index 2 - " + myStringCars[2]);
		System.out.println("Array Index 3 - " + myStringCars[3]);

		int len = myStringCars.length;
		
		for(int i =0; i<len; i=i+1) {
			System.out.println("Array Index " + i + " - " + myStringCars[i]);
		}
		

	}

}
