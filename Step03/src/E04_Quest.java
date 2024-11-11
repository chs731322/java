import java.util.Scanner;

public class E04_Quest {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 나이를 입력받아
		 * 입력받은 나이가 20세 이상이면 성인이라고 출력
		 * 입력받은 나이가 20세 미만이면 미성년자라고 출력
		 * if-else 이용
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		
		//삼항연산자를 이용
		System.out.println(age < 19 ? "미성년자입니다." : "성인입니다.");
		// String msg = age >= 20 ? "성인 " : "미성년자";
		// System.out.println(msg);
		
		/*
		 * if(age >= 20) { System.out.println("성인입니다."); } else {
		 * System.out.println("미성년자입니다."); }
		 */
	}

}