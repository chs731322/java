package e02_random;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(45)+1);
		System.out.println(r.nextFloat());
		System.out.println(r.nextBoolean());
		
		//seed 값이 같으면 실행할 때마다 나오는 숫자가 동일
		Random t = new Random(System.currentTimeMillis());
		for(int i = 0; i < 10; i++) {
			System.out.println(t.nextInt());
		}
	}
}