package e06_interface;

public class HighStudent extends Student implements Eat {

	@Override
	public void eat() {
		System.out.println("고등학생이 야자 중간에 도시락을 먹습니다.");
	}

	@Override
	public void study() {
		System.out.println("고등학생이 공부 합니다.");
	}

}
