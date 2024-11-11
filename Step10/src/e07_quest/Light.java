package e07_quest;

public class Light extends Power {

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("전등 전원 On");
	}

	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("전등 전원 Off");
	}

	@Override
	public void powerOnOff() {
		super.powerOnOff();
		if (power) {
			System.out.println("전등 전원 On");
		} else {
			System.out.println("전등 전원 Off");
		}
	}

}