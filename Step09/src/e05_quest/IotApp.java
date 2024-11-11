package e05_quest;

import java.util.ArrayList;

public class IotApp {
	private ArrayList<Power> list; // Power를 상속받은 클래스들의 인스턴스 등을 저장

	public IotApp() {
		list = new ArrayList<Power>();
		list.add(new TV());
		list.add(new Aircon());
		list.add(new Light());
		list.add(new Boiler());
	}

	// 전체 전원 On
	public void powerAllOn() {
		for (Power p : list) {
			p.powerOn();
		}
		
	}

	// 전체 전원 Off
	public void powerAllOff() {
		for (Power p : list) {
			p.powerOff();
		}
	}
	
	//새 기기 추가 - 인자값으로 Power를 상속받은 인스턴스들이 들어옴
	public void addDevice(Power device) {
		list.add(device);
	}
	

}