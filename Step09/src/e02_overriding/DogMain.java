package e02_overriding;

public class DogMain {
	
	public static void dogEat(Dog dog) {
		dog.eat();
		//dog.run(); husky에만 있는 기능 호출 X
		
	}
	
	public static void main(String[] args) {
		Retriever r = new Retriever();
		r.eat();
		
		Bulldog b = new Bulldog();
		b.eat();
		
		Husky h = new Husky();
		h.eat();
		
		System.out.println("-----------------------");
		
		dogEat(r);
		dogEat(b);
		dogEat(h);
	}
}
