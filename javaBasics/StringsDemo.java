package javaBasics;

public class StringsDemo {
	
	public static void main(String[] args) {
	
////	String Literal - Memory SAVED
//		String strName = "Ruby";
//		String StrName2 = "Ruby";
//		
////	Heap Storage - Memory WASTED
//		String strName1 = new String("Ruby");
//		String strName3 = new String("Ruby");
		
		String str = "This is the test for String";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "test";
		String str4 = "";
		String str5 = " This is the test for String ";
		String str6 = "It's ok";
		String str7 = "This is \"Highlited\" text";
		String str8 = "Good\\Bad";
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);

		System.out.println("The Length of the String is "+ str.length() );
		System.out.println("The Character at the Index 5 is "+str.charAt(5));
		System.out.println("Appending the Text - " + str.concat(" Adding More Text"));
		System.out.println("Contains Check1 - "+str.contains("test"));
		System.out.println("Contains Check2 - "+str.contains("testing"));
		
		System.out.println("Starts with Text1 - "+ str.startsWith("This"));
		System.out.println("Starts with Text2 - "+ str.startsWith(" This"));
		
		System.out.println("Ends with Text1 - "+ str.endsWith("String"));
		System.out.println("Ends with Text2 - "+ str.endsWith("string"));
		
		System.out.println("Check if Text Contains -" + str1.equals(str2));
		System.out.println("Check if Text Contains -" + str2.equals(str));
		
		System.out.println("Index of 'f' is " + str.indexOf('f'));
		System.out.println("Index of 'test' is " + str.indexOf(str3));
		
		System.out.println("Check if the String is Empty1 + " + str4.isEmpty());
		System.out.println("Check if the String is Empty2 + " + str3.isEmpty());
		
		System.out.println("Replace the text - " + str.replace("String", "Arrays"));
		
		System.out.println("Substring1 - "+ str.substring(5));
		System.out.println("Substring2 - "+ str.substring(5,11));
		
		System.out.println("Lower case - " + str.toLowerCase());
		System.out.println("Upper Case - " + str.toUpperCase());
		
		System.out.println("Remove the Trailing spaces - "+ str5.trim());
		
		
		
		
		
	}
	

}
