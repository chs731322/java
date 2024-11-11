package e05_class_array;

import java.util.Arrays;

public class PersonMain {

	public static void main(String[] args) {
		// Person 타입 길이 5인 배열 생성
		// 객체가 5번 만들어지는게 아님
		// 객체를 저장할 변수가 5개 만들어짐
		Person[] arr = new Person[5];

		arr[0] = new Person("현오", 25);
		arr[1] = new Person("철수", 30);
		arr[2] = new Person("영희", 28);
		arr[3] = new Person("수진", 22);
		arr[4] = new Person("승원", 35);

		// 배열의 내용 전부 출력 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
