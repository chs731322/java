import java.util.Scanner;

public class E05_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >>> ");
		int line = sc.nextInt();
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
