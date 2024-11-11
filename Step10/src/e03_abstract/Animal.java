package e03_abstract;
/*
 * 	추상 클래스(Abstract Class)
 * 
 *  클래스 키워드 앞에 abstract가 붙음
 *  
 */
public abstract class Animal {
	
	public Animal() {
		System.out.println("Animal 생성자");
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	// 추상 메서드
	// 추상 클래스에서만 추상 메서드 만들 수 있음
	
	public abstract void run();
	
}
