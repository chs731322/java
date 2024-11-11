package e06_static;

public class StaticVar {
	/*
	 * 		static으로 선언된 변수나 메서드는 Meta 영역에 저장
	 * 		Meta 영역은 정적인 메모리로 프로그램 시작부터 끝날 때까지 유지되는 메모리
	 * 		프로그램 시작부터 끝까지 유지가 되기 때문에 어느곳에서나 접근이 가능
	 */
	
	public static int n1 = 10;	// Meta 영역에 들어가 있음
	//static 키워드가 붙어있으면 미리 메모리가 할당되었기 때문에 접근이 가능함
	public int n2 = 20;		// 필드이기 때문에 해당 클래스가 생성이 될 때 실행이 됨 > StaticVar가 new로 생성이 되어야 함
	//n2는 StaticVar 클래스의 필드이기 때문에 아직 생성이 안됨
	//따라서 접근 불가능
	//non-static은 반드시 생성 후에 실행
	
	public static void main(String[] args) {
		StaticVar var = new StaticVar();
		System.out.println(var.n2);
		
		//static으로 선언된 변수나 상수, 메서드에 접근하는 방법
		//클래스명.변수명, 클래스명.상수명, 클래스명.메서드()
		System.out.println(StaticVar.n1);
		//객체명.변수명, 객체명.상수명, 객체명.메서드()
		System.out.println(var.n1);
		System.out.println(Math.PI);
	}
}
