package e03_super;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person(20, "김현오");
		p.printAge();
		p.a = 25;
		System.out.println(p.a);
	}

}