package e03_super;

public class Person extends Animal{
	
	private String name;
	protected int a;
	
//	- 자식 생성자가 부모 생성자에 필요한 값을 받아 부모 생성자에게 전달
//	- super(값); >> 부모 생성자를 호출하는 부분
	
	public Person(int age) {
//		System.out.println(age);  >> 부모 생성자 실행 전에는 다른 코드 삽입이 불가
		super(age);
	}

	public Person(int age, String name) {
		super(age);
		this.name = name;
	}

	public void printAge() {
		System.out.println(name + "의 나이는 " + getAge() + "입니다.");
	}

	
}