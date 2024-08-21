package javaOOConcepts;

public class ExceptionsDemo {
	
	  static void checkAge(int age) {
		    if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough! - " + age);
		    }
		  }

	  public static void main(String[ ] args) {
		  
		  checkAge(20);
		  checkAge(10);
		  
//		  int[] myNumbers = {1, 2, 3};
//	      System.out.println(myNumbers[10]);
	      
		  try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		 
	  }
	}
