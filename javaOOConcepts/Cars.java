package javaOOConcepts;

public class Cars {
	
//	State/Attributes/Variables
	private String color;
	private String make;
	private String model;
	private int year;
	

//	Behavior/Functionality
	public void increaseSpeed() {
		System.out.println("Increase the Speed");
	}
	
	public void setColor(String color) {
		System.out.println("Setting the Color");
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model.toUpperCase();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year >1999) {
		this.year = year;
		}else {
			System.out.println("The Model was not available during this period");
		}
	
	}

	
//	You can have the main method in this class itself and create objects and access all the features of the class
//	public static void main(String[] args) {
//		Cars bmwCar = new Cars();
//	    bmwCar.increaseSpeed();
//	}

}
