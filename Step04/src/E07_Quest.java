import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {

		/*
		 * 	양수 하나를 입력 받아
		 * 	1부터 입력받은 숫자까지의 합을 출력
		 * 
		 * 	숫자 : 10
		 * 	1~10까지의 합 : 55
		 * 
		 *1. 변수 선언 : 1~입력한 숫자, 입력한 숫자, 총합
		 *2. 숫자 입력
		 *3. 반복문 - 1~입력한 숫자
		 *4. 총합에다가 1~입력한 숫자 더해서 누적 저장
		 *5. 반복이 끝나면 결과 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		int sum = 0;
		
		System.out.printf("1 ~ %d까지의 합 : ", n);
		while(n > 0) {
			sum += n;
			n--;
		}
		System.out.print(sum);
		
		
		/*
		 * int i = 1, n = 0, sum = 0; n = sc.nextInt(); while( i <= n ) { sum += i++; }
		 * System.out.println(sum);
		 */
	}

}
