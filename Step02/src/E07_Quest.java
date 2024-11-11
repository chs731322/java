import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//반지름 데이터 한 개를 입력 받아서
		//입력 받은 반지름에 해당하는 원넓이 출력
		/*
		 * 1. 반지름 입력
		 * 2. 원넓이 계산
		 * 3. 결과 출력
		 */
		System.out.print("반지름을 입력하세요 >> ");
		int r = sc.nextInt();
		double area = r*r*(Math.PI);
		System.out.println("원넒이는 " + area + "입니다.");
		
	}

}
