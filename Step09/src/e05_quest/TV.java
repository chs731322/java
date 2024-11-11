package e05_quest;
/*
 * 
 * Power를 상속받아서
 * 전원을 켜고 끌 때, TV 전원 on, off 출력되게끔 메서드 제정의
 */
public class TV implements Power {

	private boolean power;
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("TV 전원 On");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("TV 전원 Off");
	}

	@Override
	public void powerOnOff() {
		power = !power;
		if(power) {
			System.out.println("TV 전원 On");
		}
		else {
			System.out.println("TV 전원 Off");
		}
	}

}
