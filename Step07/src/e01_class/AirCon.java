package e01_class;
/*
 * 			에어컨
 * 			
 * 			온도 - int / 18 - 30
 * 			바람 세기 - int / 0 - 약, 1 - 중, 2 - 강, 3 - 자동
 * 			운전 모드 - int / 0 - 냉방, 1 - 제습, 2 - 제습
 * 			전원 - boolean / true - on, false - off
 * 
 * 			온도 Up / Down
 * 			바람 세기 변경
 * 			운전 모드 변경
 * 			전원 OnOff
 * 			초기화
 */
public class AirCon {
		
	boolean power;
	int temp;
	int wind;
	int mode;
	
	final int MAX_TEMP = 30;
	final int MIN_TEMP = 18;
	final int WIND_POWER_1 = 0;
	final int WIND_POWER_2 = 1;
	final int WIND_POWER_3 = 2;
	final int WIND_POWER_AUTO = 3;
	final int MODE_COLD = 0;
	final int MODE_DEHUMI = 1;
	final int MODE_NATURAL = 2;
	
	public AirCon() {
		temp = 24;
	}
	

	void tempUp() {
		if(!power) return;
		if(temp < MAX_TEMP) temp++;
		System.out.println("현재 온도 : " + temp);
	}
	
	void tempDown() {
		if(!power) return;
		if(temp > MIN_TEMP) temp--;
		System.out.println("현재 온도 : " + temp);
	}
	
	void changeWind() {
		if(!power) return;
		wind = (wind + 1) % 4;
		switch(wind) {
		case WIND_POWER_1:
			System.out.println("현재 바람 세기 : 약풍");
			break;
		case WIND_POWER_2:
			System.out.println("현재 바람 세기 : 중풍");
			break;
		case WIND_POWER_3:
			System.out.println("현재 바람 세기 : 강풍");
			break;
		case WIND_POWER_AUTO:
			System.out.println("현재 바람 세기 : 자동");
			break;
		}
	}
	void changeMode() {
		if(!power) return;
		mode = (mode + 1) % 3;
		switch(mode) {
		case MODE_COLD:
			System.out.println("현재 운전 모드 : 냉방");
			break;
		case MODE_DEHUMI :
			System.out.println("현재 운전 모드 : 제습");
			break;
		case MODE_NATURAL:
			System.out.println("현재 운전 모드 : 송풍");
			break;
		}
	}
	
	void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("전원 ON");
		else
			System.out.println("전원 OFF");
	}
}
