package corejava_fundamentals;

class Car {
	
	String color = "Red";
	int speed = 100;
	
	public void drive() {
		System.out.println("Car is driving at " + speed + "km/perhr");
	}
	
}

public class Object {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		System.out.println("Car Color is : " +myCar.color);
		myCar.drive();
	}

}
