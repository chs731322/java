package e03_exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println("나누기 결과 : " + 5 / 0);
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
		} finally {
			//try 영역의 작업에 정상적으로 끝나든, Exception이 발생하든 무조건 실행
			System.out.println(4);
		}
		System.out.println(5);
	}

}
