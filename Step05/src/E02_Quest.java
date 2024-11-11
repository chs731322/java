import java.util.Scanner;

public class E02_Quest {

	public static void main(String[] args) {
		/*
		 * 숫자를 0입력 할 때까지 숫자 입력을 받는 반복문
		 * 반복문이 끝나면 입력 받은 숫자들의 합 출력
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int n = 1, count = 0;
//		do {
//			System.out.print("숫자 입력(0입력 시 종료) >> ");
//			n = sc.nextInt();
//			sum += n;
//			
//		} while(n != 0);
//		
//		System.out.println("숫자 총합 >> " + sum);
		
		while(n != 0) {
			System.out.print("숫자 입력(0입력 시 종료) >> ");
			n = sc.nextInt();
			sum += n;
			++count;
		}
		System.out.println("숫자 총합 >> " + sum );
		System.out.println((double)sum / (count-1));
	}

}
