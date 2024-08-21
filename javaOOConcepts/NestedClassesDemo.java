package javaOOConcepts;

public class NestedClassesDemo {
	public static void main(String[] args) {
		

		OuterClass myOuterObj = new OuterClass(); 
		
		OuterClass.InnerClass myInnerObj = myOuterObj.new InnerClass();
		
		System.out.println("Inner Class Variable " + myInnerObj.y);
		System.out.println("Outer Class Variable " + myOuterObj.x);
		System.out.println("Outer Class Variable " + myOuterObj.name);
		
	}

}
