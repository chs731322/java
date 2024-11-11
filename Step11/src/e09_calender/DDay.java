package e09_calender;

import java.util.Calendar;
import java.util.Date;

public class DDay {

	public static void main(String[] args) {
		// 오늘 날짜부터 수능까지 며칠 남았는지
		// 오늘 날짜
		Date tdy = new Date("2024/10/01");
		System.out.println(tdy);
		// 수능 날짜
		Date test = new Date(124, 10, 14);
		System.out.println(test);

		// 오늘 날짜와 수능 날짜를 빼면 오늘 날짜부터 수능 날짜까지 날짜 시간 값이 나옴
		// 하루 단위로 환산하면 수능날까지의 D데이가 나옴
		// 밀리초 -> 1000밀리초 = 1초
		long dday = (test.getTime() - tdy.getTime()) / (1000 * 60 * 60 * 24);

		System.out.println((test.getTime() - tdy.getTime()) / 1000 / 86400);
		System.out.println(dday);
		
		// Calender로 변경해서 출력
		Calendar t = Calendar.getInstance();
		Calendar s = Calendar.getInstance();
		s.set(2024, 10, 14);
		
		System.out.println(s.get(Calendar.DAY_OF_YEAR) - t.get(Calendar.DAY_OF_YEAR));
	}

}
