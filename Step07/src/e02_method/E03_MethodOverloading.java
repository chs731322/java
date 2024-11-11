package e02_method;
/*
 * 	메서드 오버로딩
 * 		메서드 이름을 중복해서 사용이 가능하게 하는 문법
 * 		이름이 같으면 구분해서 호출하는게 불가능하므로 인자값을 받을 매개변수에 차이점을 둬서 구분
 * 
 * 	1. 매개변수 개수가 다른 경우
 * 	2. 매개변수 개수가 같고, 매개변수 타입이 일치하지 않는 경우
 * 
 */

public class E03_MethodOverloading {
	
	static int plus(int a, int b) {
		return a+b;
	}
	
	static int plus(int a, int b, int c) {
		return a+b;
	}
	
	static double plus(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(plus(10, 20));
		System.out.println(plus(1.5, 23.5));
	}

}