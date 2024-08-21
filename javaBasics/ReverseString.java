package javaBasics;

import java.util.Scanner;

//added comments
public class ReverseString {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter a String to be reversed:");
		
		
		String originalText = myObj.nextLine();
		myObj.close();
		
//		use Static Text instead of Scanner obj
//		String originalText = "I like Java";
//		String finalReverseText = reverseString(originalText);

		String finalReverseText = reverseString(originalText);
		System.out.println("Reversed Text is -" + finalReverseText);

	}
	
	
	static String reverseString(String originalText) {
		String reverseText = "";

		if(originalText.isEmpty()) {
			System.out.println("Empty Strings are NOT Allowed.");
		}else {
		
			System.out.println("Original Text is -" + originalText);
			
			String[] originalArray = originalText.split(" ");
			
			for(String eachItem: originalArray) {			
				reverseText = eachItem + " " + reverseText;
			}
//			System.out.println("Reversed Text is -" + reverseText);
		}
		return reverseText;
		
	}
	

}
