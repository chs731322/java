package e04_final;

//클래스에 final 키워드가 붙어 있으면 해당 클래스를 상속 받을 수 없음
//public final class Animal {
public class Animal {
	//final이 붙은 메서드는 오버라이딩을 금지 시킨다.
	public final void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
}
