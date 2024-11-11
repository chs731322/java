package e01_object;

public class ObjectMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		Person p3 = p1;

		System.out.println(p1.equals(p2));		//true
		System.out.println(p1.equals(null));	//false
		System.out.println(p1.equals(p3));		//true
		
		Student s1 = new Student("1111", "홍길동", "멀티미디어", 3.2);
		Student s2 = new Student("1111", "홍길동", "멀티미디어", 3.2); //내용으로 해시 값은 동일
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}