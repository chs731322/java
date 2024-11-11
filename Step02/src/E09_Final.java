
public class E09_Final {

	public static void main(String[] args) {

		/*
		 * 	상수 : 한 번 저장한 값을 바꾸지 못하게 하는 변수
		 * 	
		 * 	상수명 지을 때 규칙
		 * 		1. 상수명은 모두 대문자로 구성
		 * 		2. 합성어일 경우 각 단어들 사이에 _로 연결
		 * 			> 최대 학생 인원 수 : STUDENT_MAX_COUNT
		 *
		 */
		
		final double PI = 3.1415;
		//PI = 4.151514;
		System.out.println(4*4*PI);
		
		final int a;
		a = 100; //처음 한번만 초기화 가능
//		a = 200;// 두번째부터는 불가
		
	}

}
