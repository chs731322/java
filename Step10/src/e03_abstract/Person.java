package e03_abstract;

// 추상 클래스를 상속 받으면
//1. 추상 메서드를 오버라이딩
//2. 자식 클래스도 추상 클래스 지정

public class Person extends Animal {

	public Person() {
		System.out.println("Person 생성자");
	}

	@Override
	public void run() {
//		super.run();
		System.out.println("사람이 달립니다.");
	}
}