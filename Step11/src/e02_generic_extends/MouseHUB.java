package e02_generic_extends;

// generic으로 타입 지정을 할 때, Mouse를 상속 받은 것들만 지정

public class MouseHUB<T extends Mouse> {
	private T mouse;
	
	public MouseHUB(T mouse) {
		this.mouse = mouse;
	}
	
	public void click(int n) {
		mouse.click(n);
	}
	
	public void wheel() {
		mouse.wheel();
	}
	
}
