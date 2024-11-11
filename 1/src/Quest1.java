import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("정수하나를 입력하세요: ");

		int num = scanner.nextInt();

		int sum = 0;

		for (int i = 1; i < num; i++) {

			if (num % i == 0) {
				sum += i;
			}

		}

		if (sum == num) {

			System.out.println(num + "은(는) 완전수입니다.");

		} else {

			System.out.println(num + "은(는) 완전수가 아닙니다.");

		}

	}

}