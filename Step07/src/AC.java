
public class AC {
	// 온도
	int temperature;
	// 바람
	int wind;
	// 운전모드
	boolean mode;
	// 전원
	boolean power;

	final int MIN_TEMPERATURE = 18;
	final int MAX_TEMPERATURE = 30;

	void init() {
		temperature = 24;
		wind = 1;
		mode = true;
	}

	void powerOnOff() {
		power = !power;

		System.out.println(power ? "에어컨 전원 On" : "에어컨 전원 Off");
	}

	void tempUp() {
		if (!power || !mode)
			return;

		if (temperature < MAX_TEMPERATURE)
			temperature++;
		else if (temperature == MAX_TEMPERATURE)
			System.out.println("온도가 최대치에 도달했습니다.");

		System.out.println("현재 온도 : " + temperature);
	}

	void tempDown() {
		if (!power || !mode)
			return;

		if (temperature > MIN_TEMPERATURE)
			temperature--;
		else if (temperature == MIN_TEMPERATURE)
			System.out.println("온도가 최솟값에 도달했습니다.");

		System.out.println("현재 온도 : " + temperature);

	}

	void windUp() {
		if (!power)
			return;

		wind = wind % 4 + 1;

		if (wind == 1)
			System.out.println("현재 바람 세기 : 약풍");
		else if (wind == 2)
			System.out.println("현재 바람 세기 : 중풍");
		else if (wind == 3)
			System.out.println("현재 바람 세기 : 강풍");
		else
			System.out.println("현재 바람 세기 : 자동");

	}

	void driveModeSwitch() {
		if (!power)
			return;

		mode = !mode;
		System.out.println(mode ? "냉방모드입니다." : "제습모드입니다.");
	}
}
