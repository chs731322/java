package e01_object;

import java.util.Objects;

public class Person {
	// 이름
	private String name;

	// 나이
	private int age;

	// 전체 필드 초기화 하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 객체 내용을 문자열로 만들어서 리턴
	// 필드, 메서드에 리턴 값이 있는 경우 > 외부에다가 알려줄 내용만 선택해서 사용
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	
}