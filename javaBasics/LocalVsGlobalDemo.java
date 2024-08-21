package javaBasics;

public class LocalVsGlobalDemo {
	
//	static byte byteVariable = 127;
//	static short shortVariable = -32760;
//	static int intVariable = 100;
//	static long longVariable = 8947937372984434343L;
//	static float floatVariable = 49.1234567890f;
//	static double doubleVariable = 55.1234567890;
//	static boolean boolVar = true;
//	static char charVar = 'b';
	
	static byte byteVariable;
	static short shortVariable;
	static int intVariable;
	static long longVariable;
	static float floatVariable;
	static double doubleVariable;
	static boolean boolVar;
	static char charVar;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Byte Value is " + byteVariable);
		
		System.out.println("Short Value is " + shortVariable);
		
		System.out.println("Int Value is " + intVariable);

		System.out.println("Long Value is " + longVariable);

		System.out.println("Float Value is " + floatVariable);

		System.out.println("Double Value is " + doubleVariable);

		System.out.println("Boolean Value is " + boolVar);

		System.out.println("Char Value is " + charVar);

		otherMethod();

	}
	
	public static void otherMethod() {
		
		System.out.println("----------------------");
		System.out.println("Other Method - Byte Value is " + byteVariable);
		System.out.println("Short Value is " + shortVariable);
		
		System.out.println("Int Value is " + intVariable);

		System.out.println("Long Value is " + longVariable);

		System.out.println("Float Value is " + floatVariable);

		System.out.println("Double Value is " + doubleVariable);

		System.out.println("Boolean Value is " + boolVar);

		System.out.println("Char Value is " + charVar);

		
	}

}
