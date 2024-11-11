package e05_interface;

public class InterCClass extends InterAClass implements InterB {

	//InterB에 있던 interA 추상메서드는 이미 InterAClass에서 재정의가되어있어서
	//굳이 강제로 재정의를 할 필요가 없다.
	//구현이 안된 interB만 강제로 재정의를 해야됨
	
	@Override
	public void interB() {
		System.out.println("InterB Class C");
	}

}
