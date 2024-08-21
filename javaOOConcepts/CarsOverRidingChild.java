package javaOOConcepts;

public class CarsOverRidingChild extends CarsOverRidingParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CarsOverRidingChild childObj = new CarsOverRidingChild();
//		childObj.engineStart(4);
		
//		CarsOverRidingParent parentObj = new CarsOverRidingParent();
//		parentObj.engineStart(6);
		
		CarsOverRidingParent childParentObj = new CarsOverRidingChild();
		childParentObj.engineStart(6);
		
		
	}
	
	
	public void engineStart(int cyl) {
		super.engineStart(cyl);
		System.out.println("I am from CHILD class with cyl - " + cyl);
	}
	
}
