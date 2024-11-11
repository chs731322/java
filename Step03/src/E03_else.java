
public class E03_else {

	public static void main(String[] args) {
		/*
		 * 	else
		 * 		else 이전의 모든 조건문들이 거짓일 때 실행되는 영역
		 * 		else는 마지막 조건문에 해당하기 때문에 조건식이 없고, 맨 마지막에 작성됨
		 * 		if가 생략된 상태로는 사용 불가
		 * 
		 */
		
		int n = 10;
		
		if(n % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}
