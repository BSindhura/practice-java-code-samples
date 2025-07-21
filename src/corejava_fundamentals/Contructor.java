package corejava_fundamentals;

class TeslaCar {
	
	String color;
	int speed;
	
	TeslaCar(String c, int s){
		color = c;
		speed = s;
		
	}
	
	void drive() {
		System.out.println(color + "car is driving at " + speed + "km/hr");
	}
}

public class Contructor {

	public static void main(String[] args) {
		  
    TeslaCar myCar = new TeslaCar("Red", 120);
    myCar.drive();
    
	}

}
