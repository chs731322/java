package e01_inheritance;

public class Person extends Animal{
	public Person() {
		System.out.println("Person 생성자");
	}
	
	// 나이 출력하는 메서드
	public void printAge() {
		System.out.println("내 나이는 " + age + "입니다.");
	}
	
}