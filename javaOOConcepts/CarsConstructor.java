package javaOOConcepts;

public class CarsConstructor {
	
	String make;
	int gear;
	int speed;
	
	
	public CarsConstructor() {
		this.gear = 0;
		this.speed = 0;
		System.out.println("I am inside the Constructor with no Parameters");
		
	}
	
	public CarsConstructor(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		System.out.println("I am inside the Constructor with no Parameters");
		
	}
	
	public int getSpeed() {
		return this.speed;
	}
	

	public static void main(String[] args) {
		CarsConstructor	bmw = new CarsConstructor();
		int bmwCarSpeed = bmw.getSpeed();
		
		System.out.println("BMW Car Speed is - "+ bmwCarSpeed);
		
		CarsConstructor	audi = new CarsConstructor(1,5);
		int audiCarSpeed = audi.getSpeed();
		
		System.out.println("Audi Car Speed is - "+ audiCarSpeed);
	}

}
