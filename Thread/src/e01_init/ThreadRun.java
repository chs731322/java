package e01_init;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadRun extends Thread {
	
	@Override
	public void run() {
		// 자동으로 스레드가 일하는 부분
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss.SSS");
		for(int i = 0; i < 100; i++) {
			System.out.println(i + "번째 일 - " + getName() + " / " + sdf.format(new Date(System.nanoTime())));
		}
		System.out.println(getName() + " 종료");
	}
	
}