package e02_method;

import e04_access.Square;
//불러오는역할
//package.* : 해당 패키지 전체 import

public class E04_CallRefVal {
	public static int addNumber(int n) {
		n = n + 1;
		return n;
	}
	
	public static void initSquare(Square s) {
		s.setw(10);
		s.seth(5);
	}

	public static void main(String[] args) {	//main의 값은 변하는게 아니라 복사하는 것
		int n = 10;
		addNumber(n);		//따라서 addNumber에 있는 n만 값이 11로 바뀌고 소멸됨
		System.out.println(n);	//main에 있는 n은 10으로 변함이 없기 때문에 10 출력
		
		Square s = new Square(40, 20);
		initSquare(s);
		System.out.println(s);
		
	}

}