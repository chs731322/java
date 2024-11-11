
public class E03_Operator {

	public static void main(String[] args) {
		/*
		 * 사칙 연산 덧셈 + 뺄셈 - 곱셈 * 나눗셈 / (몫) 나눗셈 % (나머지)
		 */

		// 정수형 변수 두 개 선언하여, 원하는 값으로 초기화
		int n1 = 12, n2 = 5;
		// 연산 결과 저장할 정수형 변수 선언 및 초기화
		int result = 0;

		result = n1 + n2;
		System.out.println(result);

		result = n1 - n2;
		System.out.println(result);

		result = n1 * n2;
		System.out.println(result);

		result = n1 / n2;
		System.out.println(result);

		result = n1 % n2;
		System.out.println(result);

		result = (n1 + 2) * n2 / 5;
		System.out.println(result);

	}

}
