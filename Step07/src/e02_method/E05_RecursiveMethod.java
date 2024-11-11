package e02_method;

public class E05_RecursiveMethod {

	// 매개변수로 숫자 하나 받아서 해당 숫자의 팩토리얼 값을 리턴하는 메서드

	public static int fac(int n) {
		if (n == 1)
			return 1;
		return n * fac(n - 1);
	}

	// 매개변수로 숫자 하나를 받아서 숫자에 해당하는 2의 n승 값을 리턴하는 메서드
	// 매개 변수로 값이 6 > 리턴할 값 64 2의 6승값 리턴

	public static int power(int n) {
		if (n == 1)
			return 2;
		return 2 * power(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(fac(5));
		System.out.println(power(10));
	}
	
}