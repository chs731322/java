import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 삼각형 밑변과 높이를 입력 받아서
		// 삼각형의 넓이를 출력
		// 단, 출력 결과는 소수점이 반드시 나와야함
		/*
		 * 1. 밑변과 높이 입력 받기
		 */

		System.out.print("밑변 길이 >> ");
		int w = sc.nextInt();
		System.out.print("높이 길이 >> ");
		int h = sc.nextInt();

		double a = w * h * 0.5;
		System.out.println("삼각형의 넓이는 >> " + a);

	}

}
