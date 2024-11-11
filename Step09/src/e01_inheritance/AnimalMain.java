package e01_inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		
		Person person = new Person();
		person.eat();
		person.printAge();
	}

}