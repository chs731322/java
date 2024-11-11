import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		/*
		 * 1. 숫자 입력, 팩토리얼 저장할 변수, 1~입력한 숫자까지 제어할 변수
		 * 2. 1~입력한 숫자까지 반복
		 * 3. 반복할 일 : 팩토리얼에 1~입력한 숫자를 1개씩 곱해서 저장
		 * 4. 결과 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		int result = 1;
		
		while(n > 0) {
			result *= n;
			n--;
		}
		System.out.println("해당 숫자의 팩토리얼 값 >> " + result);
	}

}