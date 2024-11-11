import java.util.Scanner;

public class E15_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//숫자 두개 입력 받아 작은 숫자부터 큰 숫자까지의 합 출력
		
		System.out.print("숫자1 입력 >> ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 입력 >> ");
		int n2 = sc.nextInt();
		
		int sum = 0;
		/*
		 * if(n1 < n2) { for (; n1 <= n2; n1++) { sum += n1; } } else { for(; n2 <= n1;
		 * n2++) { sum += n2; } } System.out.println(sum);
		 */
		
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		for (; n1 <= n2; n1++) {
			sum += n1;
		}
		System.out.println(sum);
	}

}
