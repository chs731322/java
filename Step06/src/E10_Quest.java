import java.util.Scanner;

public class E10_Quest {

	public static void main(String[] args) {
		//숫자를 입력 받아 해당 숫자가 소수인지 아닌지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		boolean flag = num < 2 ? true : false;
		
		for(int i = 2; i <= num/2; i++) { // 약수는 항상 쌍(1,6), (2, 3)으로 존재하기 때문에 num의 반만 비교해도 상관없음.
			if(num % i == 0) 
				flag = true;
				break;
		}
		
		if(flag)
			System.out.println("소수가 아닙니다.");
		else
			System.out.println("소수입니다.");
	}

}
