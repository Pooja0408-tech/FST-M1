package activities;

public class Car {

	String brand;
	String color;
	String transmission;
	int make;
	int tyres = 4;
	int doors = 4;
	
	//constructor
	public Car(String brand, String color, String transmission, int make) {
		this.brand = brand;
		this.color = color;
		this.transmission = transmission;
		this.make = make;
	}
	
	public void displaycharacteristics(){
	System.out.println("Brand of the car is: "+ this.brand);
	System.out.println("color of the car is: " + this.color);
	System.out.println("The transmission type is: " + this.transmission);
	System.out.println("Car is made in the year: " + this.make);
	System.out.println("No. of doors: " + this.doors);
	System.out.println("No. of tyres: " + this.tyres); 
	
	}
	public static void accelerate() {
		System.out.println("Car moves forward");
	}
	
	public static void brake() {
		System.out.println("Car stops");

	}

}
