package e03_super;

public class AvanteN extends Avante{
	private boolean driveMode;
	//false - 일반, true - 고속 주행
	
	public void changeMode() {
		driveMode = !driveMode;
		
		if(driveMode)
			System.out.println("고속 주행 모드로 전환합니다.");
		else
			System.out.println("일반 주행 모드로 전환합니다.");
		
	}

	@Override
	public void accelRate() {
		if(driveMode) {
			if(fuel < 1) {
				System.out.println("현재 연료가 없습니다. 채워주세요.");
				return;
			}
			System.out.println("액셀을 밟습니다.");
			speed += 15;
			if(speed > 240) speed = 240;
			fuel -= 3;
			System.out.println("현재 속도 : " + speed + "km/h - 남은 연료 : " + fuel);
		} else {
		super.accelRate();
		}
	}
	
	
}
