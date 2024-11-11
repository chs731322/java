package e07_quest;
/*
 * 전원 클래스
	전원 값 - 상황에 따라 자식 클래스에서 관리
	전원을 켜는 메서드
	전원을 끄는 메서드
	전원을 켜고 끄고하는 메서드

 */

public class Power {
	protected boolean power;

	public void powerOn() {
		power = true;
	}

	public void powerOff() {
		power = false;
	}
	
	public void powerOnOff() {
		power = !power;
	}
	
}
