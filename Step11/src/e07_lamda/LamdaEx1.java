package e07_lamda;

public class LamdaEx1 {
	/*
	 * 	람다 (Lamda)
	 * 	
	 * 	함수형 프로그래밍 스타일을 지원하는 방법
	 * 	JDK 8버전부터 도입된 기능
	 * 	익명 함수의 한 형태로 메서드를 간단하게 표현할 수 있음
	 * 	
	 * 	(매개변수) -> 실행할 코드 한 줄;
	 * 
	 * 	(매개변수) -> {
	 * 		실행할 코드 1;
	 * 		실행할 코드 2;
	 * 		실행할 코드 3;
	 * 		...
	 * 	}
	 */
	public static void main(String[] args) {
		// Calcurator 익명 클래스로 만들어서 덧셈하는 기능 작성
		Calcurator cal = new Calcurator() {
			
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(cal.calc(10, 5));
		
		Calcurator calc = (a, b) -> a + b;
		System.out.println(calc.calc(10, 30));
		
		Calcurator sub = (i, j) -> i - j;
		System.out.println(sub.calc(50, 25));
		
		Calcurator bigger = (m, n) -> m > n ? m : n;
		System.out.println(bigger.calc(30, 100));
		
		Calcurator total = (x, y) -> {
			// x부터 y까지 합 리턴
			int sum = 0;
			if(x > y) {
				int temp = x;
				x = y;
				y = temp;
			}
			
			for(; x <= y; x++)
				sum += x;
			
			return sum;
		};
		System.out.println(total.calc(10, 1));
	}
}
