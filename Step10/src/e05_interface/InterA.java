package e05_interface;
/*	
 * 		 인터페이스(Interface)
 * 			클래스 대용품
 * 			서로 다른 클래스들을 기능을 기준으로 묶기 위해 나왔음
 * 			자바에서는 단일 상속만 허용하기때문에 다른 언어의 다중 상속 효과를 줌
 * 			메모리가 직접적으로 할당 되지 않음
 * 			전역 상수, 추상 메서드, 디폴트 메서드(8버전 부터 추가됨)
 * 
 */
public interface InterA {
	//public static final 안써도 자동으로 붙음
	public static final double PI = 3.1415;
	//public abstract 안써도 자동으로 붙음
	public abstract void interA();
	
	//디폴트 메서드 --> jdk8 버전부터 지원
	default double circleArea(double r) {
		return r * r * PI;
	}
}









