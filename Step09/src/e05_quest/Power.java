package e05_quest;
/*
 * 전원 클래스
	전원 값 - 상황에 따라 자식 클래스에서 관리
	전원을 켜는 메서드
	전원을 끄는 메서드
	전원을 켜고 끄고하는 메서드

 */

public interface Power {
	
	public void powerOn();
	public void powerOff(); 
	public void powerOnOff();
	
}
