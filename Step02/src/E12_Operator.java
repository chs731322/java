
public class E12_Operator {

	public static void main(String[] args) {

		/*
		 * 	관계(비교) 연산자 > 명제, 조건식
		 * 		결과는 true와 false로 나옴
		 * 
		 * 	>	<	>=	<=	==	!=
		 * 
		 */
		
		int n1 = 10, n2 = 7;
		
		System.out.println(n1 < n2);
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		double d1 = 0.1, d2 = 0.2;
		System.out.println(d1 + d2 == 0.3);
		System.out.println(d1 + d2);
		System.out.println("-------------------");
		
		boolean flag = d1 == d2;
		System.out.println(flag);
		
	}

}
