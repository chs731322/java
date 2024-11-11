package e04_access;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("김철수", 30);
		p1.setAge(40);
		p1.setName("김영희");
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
	}

}