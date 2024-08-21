package javaOOConcepts;

public class CarsDemo {

	public static void main(String[] args) {

		Cars audiCar = new Cars();
		
		audiCar.increaseSpeed();
		
		audiCar.setColor("Blue");
		String carColor = audiCar.getColor();
		System.out.println("Car Color is " + carColor);
		
		audiCar.setMake("Nissan");
		System.out.println("Make of the Car is " + audiCar.getMake());
		
		
		audiCar.setYear(1999);
		System.out.println("Make of the Car is " + audiCar.getYear());

		Cars bmwCar = new Cars();
		
		bmwCar.increaseSpeed();

		
	}

}
