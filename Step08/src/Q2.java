
//숫자 랜덤으로 생성(범위 양수로 자유롭게) > 해당 숫자가 소수인지 출력
//
//직접 만든 메서드 추가

import java.util.Random;

public class Q2 {
	public static void Loop(int n, int count) {
		System.out.println(n);
		for(int i = 1; i < n/2; i++) {
			if(n % i == 0)
				count++;
		}
		if(count == 1)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}

	public static void main(String[] args) {
		Random r = new Random();
		
		Loop(r.nextInt(100)+1, 0);
	}
}