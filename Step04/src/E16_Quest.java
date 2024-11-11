import java.util.Scanner;

public class E16_Quest {

	public static void main(String[] args) {
		//정수 하나 입력 받은 후 해당 정수의 약수의 개수 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				++count;
			}
		}
		System.out.println("약수의 개수는 " + count);
		
	}

}