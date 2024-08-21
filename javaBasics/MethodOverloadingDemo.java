package javaBasics;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = addNum(3,5);
		System.out.println(myNum);
		
		double myNum1 = addNum(3,5.0);
		System.out.println(myNum1);
		
		double myNum2 = addNum(3.0,5);
		System.out.println(myNum2);

	}
	
	
	static int addNum(int x, int y) {
		return x+y;
	}
	
	static double addNum(int x, double y) {
		return x+y;
	}
	
	static double addNum(double x, int y) {
		return x+y;
	}
	
}
