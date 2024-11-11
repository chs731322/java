import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받아 입력 받은 숫자가 소수인지 아닌지 출력
		//(소수는 1과 자기 자신만 약수로 존재하는 숫자)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 >> ");
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				cnt++;
		}
		if(cnt == 2)
			System.out.println("해당 숫자는 소수입니다.");
		else
			System.out.println("해당 숫자는 소수가 아닙니다.");
	}

}
