
public class E09_For {

	public static void main(String[] args) {
		/*
		 * 		for(초기화; 조건식 ; 증감식) {
		 * 			실행할 코드 ...
		 * 		}
		 */
		int i = 0;
		for(i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		System.out.println(i);
		
		for(int j = 0; j < 5; j++) {
			System.out.println("안녕하세요");
		}
		//System.out.println(j); > Error
		//j는 for문에서 사용하기 위해 선언 한 변수이기 때문에 for문이 종료되면 사라진다.
		// >> 지역 변수 (Local Variable)
	}

}