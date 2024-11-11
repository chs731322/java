
public class E19_Quest {

	public static void main(String[] args) {
		/*
		 * 
		 * 알파벳 A부터 Z까지 출력 단, 대문자와 소문자를 아래 형식으로 출력 
		 * A - a
		 * B - b ..
		 * 
		 * char 형 변수 A와 a의 문자코드값 이용
		 * 
		 */

		for (char al = 'A'; al <= 'Z'; al++)
			System.out.printf("%c - %c\n", al, al+32);
		
	}

}
