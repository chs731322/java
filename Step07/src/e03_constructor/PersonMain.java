package e03_constructor;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동");
		Person p3 = new Person("김철수", 30);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p2.printPerson();
		p3.printPerson();
		
	}

}