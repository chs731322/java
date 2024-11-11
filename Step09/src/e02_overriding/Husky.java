package e02_overriding;

public class Husky extends Dog{

	public void eat() {
		System.out.println("허스키는 참치를 먹습니다.");
		run();
	}

	public void run() {
		System.out.println("허스키가 달립니다.");
	}
	
}
