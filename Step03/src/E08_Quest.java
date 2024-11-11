import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {

		/*
		 * 
		 * 숫자 두 개를 입력해서
		 * 두 숫자의 뺄셈 결과를
		 * 무조건 양수로 되게끔 출력
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자1을 입력하세요 >> ");
		int n1 = sc.nextInt();
		System.out.print("숫자2를 입력하세요 >> ");
		int n2 = sc.nextInt();
		/*
		 * if(n1 >= n2) 
		 * System.out.println(n1-n2); 
		 * else 
		 * System.out.println(n2-n1);
		 */
		
		/*
		 * int result = n1 - n2;
		 * 
		 * if(result < 0)
		 * result = -result;
		 * System.out.println(result);
		 * 
		 */
		
		/*
		 * 
		 * if(n1 > n2) {
		 * 		int temp = n2;
		 * 		n2 = n1;
		 * 		n1 = temp;
		 * }
		 * 
		 * System.out.println(n1 - n2);
		 */
		
		//System.out.println(Math.abs(n1 - n2));
		System.out.println(n1 >= n2 ? n1 - n2 : n2 - n1);
		
	}

}
