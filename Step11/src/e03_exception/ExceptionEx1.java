package e03_exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			// 작업 영역
			// 에러가 발생할 수 있는 영역
			System.out.println(1);
			System.out.println("나누기 결과 : " + 5 / 0);
			System.out.println(2);
		} catch (Exception e) {
			// try 영역에서 Exception(런타임 에러)이 발생했을 때 처리하는 영역
			// catch 영역은 에러가 발생했을 때만 실행됨
			System.out.println(3);
		}
		System.out.println(4);
	}
}