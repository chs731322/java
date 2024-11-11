import java.util.Scanner;

public class E12_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		int result = 1, i = 1;

		for (i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("해당 숫자의 팩토리얼 값 >> " + result);

	}

}
