package e03_abstract;

//추상 클래스는 직접적으로 생성되지 않음
//자식 클래스가 생성될 때만 간접적으로 생성
//일반적으로는 최상위 클래스로 존재(최초에 클래스의 구조를 잡는 용도)

public class AbstractMain {

	public static void main(String[] args) {
//		Animal a = new Animal();
		Person p = new Person();
		p.eat();
		p.run();
		
		// 추상 클래스도 데이터 타입
		// 자식 클래스를 형변환 시켜서 저장
		
		Animal a = p;
		a.eat();
		a.run();
		
	}

}