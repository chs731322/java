package e07_lamda;

import e06_event.Button;

public class LamdaEx2 {
	public static void calc(int x, int y, Calcurator cal) {
		System.out.println(cal.calc(x, y));
	}
	
	public static void main(String[] args) {
		calc(10, 20, new Calcurator() {
			
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		});
		calc(10, 20, (x, y) -> x + y);
		
		Button btnOk = new Button("확인");
		btnOk.setOnClickListener(x -> System.out.println(x.getName() + "버튼 클릭"));
		btnOk.onClick();
	}
}