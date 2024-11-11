package e03_constructor;

public class Animal {
	String species;
	int age;
	
	//필드 초기화 생성자 단축키 :  Alt + Shift + S > O
	public Animal(int age) {
		super();
		this.age = age;
	}

	public Animal(String species, int age) {
		this.species = species;
		this.age = age;
	}

	//기본 생성자 단축키 : Alt + Shift + S > C
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
