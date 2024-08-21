package javaOOConcepts;

public class OuterClass {
	
	int x= 5;
	String name = "Java";
	
	public void outerMethod() {
		System.out.println("I am Outer Method");
	}
	
	class InnerClass{
		
		int y = 10;
		
		public void innerMethod() {
			System.out.println("I am Inner Method");
		}
		
		

		
		
	}
	
	

}
