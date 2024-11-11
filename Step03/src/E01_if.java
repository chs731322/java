
public class E01_if {

	public static void main(String[] args) {

		/*
		 * if문
		 * 		조건식이 true면 if문에 붙어있는 {실행 영역}에 있는 코드를 실행
		 * 		조건식이 false면 해당 if문을 건너뜀
		 * 
		 * 조건식 : 관계 연산자, 논리 연산자를 이용한 수식. 결과는 true/false로 나옴
		 * 
		 * if(조건식) {
		 * 		실행문
		 * 		..
		 * }
		 *
		 *	if문의 구성요소는 if, else if, else가 있음
		 *
		 */
		
		int n = 0;
		
		if(n<0) {
			System.out.println("음수입니다.");
		}
		if(n>0) {
			System.out.println("양수입니다.");
		}
		if(n==0) {
			System.out.println("0입니다.");
		}
		
		System.out.println("프로그램 종료");
		
	}

}
