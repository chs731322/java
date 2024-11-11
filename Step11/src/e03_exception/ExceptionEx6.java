package e03_exception;

import java.util.Scanner;

public class ExceptionEx6 {
	public static void main(String[] args) throws Exception{
		try {
		// 숫자 두 개 입력 받아서 만든 메서드를 실행 후 결과 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1을 입력하세요 >> ");
		int a = sc.nextInt();
		System.out.print("숫자 2를 입력하세요 >> ");
		int b = sc.nextInt();
		
		if(b == 0)
			throw new Exception("0으로 나누면 안됩니다.");
		
		System.out.println(a/b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
		
	}

}