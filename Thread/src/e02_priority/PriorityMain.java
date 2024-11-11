package e02_priority;

import java.util.ArrayList;

public class PriorityMain {

	public static void main(String[] args) {
		ArrayList<ThreadPriority> list = new ArrayList<ThreadPriority>();
		
		for(int i = 0; i < 10; i++) {
			ThreadPriority t = new ThreadPriority("스레드 " + i);
			t.setPriority(Thread.MIN_PRIORITY);
			list.add(t);
		}
		
		// 우선 순위는 1~10까지 범위, 1 - 제일 낮음, 10 - 제일 높음
		list.getLast().setPriority(Thread.MAX_PRIORITY);	// 스레드 9를 우선 순위 10으로 설정
		list.forEach(t -> t.start());
		
	}
	
}