import java.util.Scanner;

public class E14_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//완전수
		
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n/2; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		
		if(sum == n)
			System.out.println("완전수입니다.");
		else
			System.out.println("완전수가 아닙니다.");

	}

}
