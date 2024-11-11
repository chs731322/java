package e04_object_io;

import java.io.Serializable;

// 알아서 현재 데이터를 직렬화해줌
public class Person implements Serializable {
	
	private String name;
	private int age;
	//transient : 직렬화 대상에서 제외, 파일에 저장하지 않게 제외

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}