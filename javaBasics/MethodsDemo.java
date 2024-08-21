package javaBasics;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		welcomeMessage();
		welcomeMessageWithParameters("python",5);
		welcomeMessageWithParameters("Ruby",3);
		int myRandomNum = getRandomNumber();
		System.out.println("New UserName is - User" + myRandomNum);
		int myRandomNum1 = getRandomNumber();
		System.out.println("New UserName is - User" + myRandomNum1);

	}
	
	static void welcomeMessage(){
		System.out.println("Welcome to Java language");
	}
	
	static void welcomeMessageWithParameters(String languageName, int booksCount){
		System.out.println("Welcome to " + languageName + " language. It needs Books-"+booksCount);
	}
	
	static int getRandomNumber() {
		return (int) (Math.random()*101);
	}
	
//	static void loginOrbitz(String userName, String pwd) {
//		fasdfdsf.userName
//		fasdkjflkf
//		asd
//		fsdfsa
//		fd
//		
//	}

	
	
	
	
	
	
	

}
