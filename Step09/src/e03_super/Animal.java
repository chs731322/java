package e03_super;

public class Animal {
	private int age;

	public Animal(int age) {
		this.setAge(age);
	}
	
	public void printAge() {
		System.out.println("이 동물의 나이는 " + getAge() + "입니다.");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
