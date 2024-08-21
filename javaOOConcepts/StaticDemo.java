package javaOOConcepts;

public class StaticDemo {
	
	int myFavNum = 7;
	static int myLeastNum = 19;
	
	public void myPublicMethod() {
		System.out.println("Public method");
		System.out.println(myFavNum);
		System.out.println(myLeastNum);
		
	}
	
	static void myStaticMethod() {
		System.out.println("Static Method");
//		System.out.println(myFavNum);
		System.out.println(myLeastNum);
	}
	
	public static void main(String[] args) {
		
		StaticDemo myObj = new StaticDemo();
		
		myObj.myPublicMethod();
		myObj.myStaticMethod();
		
		myStaticMethod();
		myLeastNum = 3;
		
	}

}
