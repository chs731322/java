package e02_random;

import java.util.Random;

public class E10_Quest {
	
	public static boolean isPrimeNumber(int n) {
		if(n < 2) return false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
//		 숫자를 입력 받아 해당 숫자가 소수인지 아닌지 출력
		Random r = new Random();
		int num = r.nextInt(500);
		System.out.println(num + " ");


		if (isPrimeNumber(num))
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}

}
