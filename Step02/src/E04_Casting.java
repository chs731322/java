
public class E04_Casting {

	public static void main(String[] args) {

		/*
		 * 		데이터 형변환 : 데이터 타입을 바꾸는 행위
		 * 
		 * 		1. 자동으로 데이터가 형변환되는 경우 (오토캐스팅) : 연산할 때 자동으로 변환
		 * 			- 수의 체계상 작은 개념과 큰 개념이 계산했을 때
		 * 				> 실수와 정수가 계산할 때 정수가 실수로 바뀐다(데이터 손실 X)
		 * 			- 메모리 바이트 수가 작은 타입이 큰 타입과 계산 했을 때
		 * 				> int형과 long이 계산했을 때는 int형이 long으로 변환
		 * 			- short나 byte 타입에 int형으로 데이터를 넣을 때 자동으로 형변환
		 * 
		 * 		2. 강제로 데이터 형변환 : 데이터 손실이 일어날 수 있음
		 * 			- 큰 개념을 작은 개념으로 바꿔야 될 때
		 * 				> 실수를 정수로 바꿀 때
		 * 			- 메모리 바이트 수가 큰 타입을 작은 타입으로 바꿔야 할 때
		 * 				> double타입을 float로 바꿀 때
		 */
		
		//자동으로 형 변환 되는 경우
		int n = 120;
		double d = 3.12;
		System.out.println(n / d); // 형변환 되는 것은 n (int > double)
		d = n;
		System.out.println(d);
		
		short s = 100; // 100은 int지만 저장될 때는 short로 저장된다.
		//byte와 short는 int형에서 자동으로 형 변환되어서 저장
		
		long l = 100l;
		System.out.println(l - s); //short가 long으로 바뀜

		System.out.println('A' + 1); // A가 65 int로 형변환 되어 결과값은 66 // 'A'는 char으로 2byte, 1은 int로 4byte
		
		//강제로 형변환 하는 방법 > (바꾸고 싶은 변수 타입) 값 or 변수
		double pi = 3.1415;
		int i = (int)pi;
		System.out.println();
		
		i = 65;
		char c2 = (char)i;
		System.out.println(c2);
		
	}

}
