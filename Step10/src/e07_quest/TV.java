package e07_quest;
/*
 * 
 * Power를 상속받아서
 * 전원을 켜고 끌 때, TV 전원 on, off 출력되게끔 메서드 제정의
 */
public class TV extends Power {

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("TV 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("TV 전원 Off");
	}

	@Override
	public void powerOnOff() {
		super.powerOnOff();
		if(power) {
			System.out.println("TV 전원 On");
		}
		else {
			System.out.println("TV 전원 Off");
		}
	}

}
