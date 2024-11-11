package e01_class;

/*
 * 	데이터 : 음량(int/0~50), 채널(int/1~766), 전원(boolean/true - on, false - off), 음소거(boolean/true - on, false - off)
 * 			
 * 
 * 	기능 : 전원 on&off, 음량 up/down, 채널 up/down, 음소거 on&off
 */
public class TV {
	int volume;
	int channel;
	boolean power = false;
	boolean mute = false;

	final int MAX_CHANNEL = 766;
	final int MIN_CHANNEL = 1;
	final int MAX_VOLUME;
	final int MIN_VOLUME = 0;
	
	public TV() {
		channel = 24;
		volume = 10;
		//final로 선언된 필드는 선언시 초기화를 안한다면 생성자에서 반드시 초기화 시켜야함
		MAX_VOLUME = 60;
	}

	void powerOnOff() {
		// 메서드를 실행 할 때마다 전원이 켜졌다가 꺼졌다가 해야함
		// 전원 값이 true > TV 전원 On
		// 전원 값이 false > TV 전원 Off
		power = !power;
		System.out.println(power ? "TV 전원 ON" : "TV 전원 OFF");
	}

	// 채널 up
	void channelUp() {
		if(!power) return;
		channel = channel % MAX_CHANNEL + 1;
//		channel = channel < 766 ? channel + 1 : 1;

		System.out.printf("채널 %d번\n", channel);
	}
	
	// 채널 down
	void channelDown() {
		if(!power) return;
		channel = channel == MIN_CHANNEL ? MAX_CHANNEL : channel - 1;
		
		System.out.printf("채널 %d번\n", channel);
	}
	
	//음소거 on off
	void muteOnOff() {
		if(!power) return;
		mute = !mute;
		System.out.println(mute ? "음소거 ON" : "음소거 OFF");
	}
	
	// 음량 up
	void volumeUp() {
		if(!power) return;

		if(mute) muteOnOff();
		
		if(volume < MAX_VOLUME) volume++;
		
		System.out.printf("볼륨 : %d\n", volume);
	}
	
	// 음량 down
	void volumeDown() {
		if(!power) return;
		
		if(mute) muteOnOff();
		
		volume = volume == MIN_VOLUME ? MIN_VOLUME : volume-1;
		System.out.printf("볼륨 : %d\n", volume);
	}
}
