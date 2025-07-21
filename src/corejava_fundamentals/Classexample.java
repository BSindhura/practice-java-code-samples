package corejava_fundamentals;

class Dog {
	
	String name = "Snoopy";
	int age = 7;
	
	public void bark() {
		
		System.out.println(name + " is barking");
	}
}

public class Classexample {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		System.out.println("Dog name is "+ myDog.name);
		System.out.println("Dog age is "+ myDog.age);
		myDog.bark();

	}

}
