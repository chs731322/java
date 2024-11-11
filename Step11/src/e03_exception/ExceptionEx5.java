package e03_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {
	// static 메서드
	// 숫자 두 개를 받아 나눈 결과를 리턴하는 메서드

	public static int divide(int a, int b)  {
		return a / b;
	}
	public static void main(String[] args) {
		try {
		// 숫자 두 개 입력 받아서 만든 메서드를 실행 후 결과 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1을 입력하세요 >> ");
		int a = sc.nextInt();
		System.out.print("숫자 2를 입력하세요 >> ");
		int b = sc.nextInt();
		
		System.out.println("두 숫자를 나눈 값 : " + divide(a, b));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야 합니다.");
		}
		System.out.println("프로그램 정상 종료");
		
	}

}