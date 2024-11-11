import java.util.Scanner;

public class E06_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형 데이터 두 개 입력 받아서
		// 입력 받은 두 개의 숫자들을 이용해 사칙 연산 결과 출력
		/*
		 * 1. 숫자 입력, 두 번
		 * 2. 계산
		 * 3. 결과 출력
		 */
		
		System.out.print("숫자1을 입력하세요 >> ");
		int n1 = sc.nextInt(); 
		
		System.out.print("숫자2를 입력하세요 >> ");
		int n2 = sc.nextInt();

		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		
	}

}
