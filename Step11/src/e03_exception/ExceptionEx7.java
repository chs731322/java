package e03_exception;

import java.util.Scanner;

public class ExceptionEx7 {
	public static void main(String[] args) throws UserException {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자 1을 입력하세요 >> ");
			int a = sc.nextInt();
			if (a < 1)
				throw new UserException("숫자는 양수로 입력해야 합니다.");
			System.out.print("숫자 2를 입력하세요 >> ");
			int b = sc.nextInt();
			if (b < 1)
				throw new UserException("숫자는 양수로 입력해야 합니다.");

			System.out.println(a * b);
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}

	}
}
