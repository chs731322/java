import java.util.Scanner;

public class E02_Quest {

	public static void main(String[] args) {

		/*
		 * 
		 * 	숫자 하나를 입력 받아서
		 * 	해당 숫자가 짝수인지, 홀수인지, 0인지 구분해서 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();

		if(n % 2 == 0 && n != 0) {
			System.out.println("짝수입니다.");
		}

		if(n % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		if(n == 0) {
			System.out.println("0입니다.");
		}
		
		System.out.println("프로그램 종료");
		
	}

}
