import java.util.Scanner;

public class E18_Quest {

	public static void main(String[] args) {
		// 사용자로부터 나이를 입력 받아
		// 입력 받은 나이가 미성년자인지 성인인지 출력
		// 단, 나이는 0보다 큰 값을 받아야함.
		// 0 이하의 값이 들어오면 다시 입력 받게끔 처리

		Scanner sc = new Scanner(System.in);
		int age = 0;

		
		do {
			System.out.print("나이 입력(0보다 큰 값 입력) >> ");
			age = sc.nextInt();
			if(age <= 0) {
				System.out.println("나이를 잘못 입력하셨습니다.");
			}
		} while (age <= 0);
		
		if (age >= 20)
			System.out.println("성인입니다.");
		else
			System.out.println("미성년자입니다.");
		
		

	}

}
