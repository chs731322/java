package e06_interface;

import java.util.ArrayList;

public class EatMain {
	public static void eat(Eat e) {
		e.eat();
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Student s = new Student();
		HighStudent h = new HighStudent();
		
		eat(a);
		eat(d);
//		eat(s);
		eat(h);
		
		ArrayList<Eat> list = new ArrayList<Eat>();
		list.add(h);
		list.add(d);
		list.add(a);
		
		for(Eat e : list)
			e.eat();
		
	}

}
