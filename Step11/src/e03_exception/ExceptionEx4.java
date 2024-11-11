package e03_exception;

public class ExceptionEx4 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println("나누기 결과 : " + 5 / 1);
			System.out.println(2);
		}  finally {
			System.out.println(3);
		}
		System.out.println(4);
	}

}
