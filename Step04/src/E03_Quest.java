import java.util.Scanner;

public class E03_Quest {

	public static void main(String[] args) {

		/*
		 * 숫자 입력 받아서
		 * 입력 받은 개수 만큼 Hello World 출력
		 * 
		 * 1. 입력한 개수 만큼
		 * 2. Hello World 추가
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		
		while(n-- > 0) 
			System.out.println("Hello World");
		
		
		
	}

}