package activities;

public class activity1 {

	public static void main(String[] args) {
		Car carObj1 = new Car("Honda", "Black" , "Automatic" , 2022);
		Car carObj2 = new Car("BWM" ,"Blue" , "Manual", 2019);
				
		System.out.println();
		carObj1.displaycharacteristics();
		carObj1.accelerate();
		carObj1.brake();
		carObj2.displaycharacteristics();
		carObj1.accelerate();
		carObj1.brake();


	}

}
