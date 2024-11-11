package e02_generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		GamingMouse gamingMouse = new GamingMouse();
		OfficeMouse officeMouse = new OfficeMouse();
		
		MouseHUB<GamingMouse> hub = new MouseHUB<GamingMouse>(gamingMouse);
		hub.click(1);
		hub.click(2);
		hub.wheel();
		
		//OfficeMouse는 Mouse를 상속 받지 않아서 제네릭 지정하는 타입으로 쓸 수 없음
//		MouseHUB<OfficeMouse> hub2 = new MouseHUB<OfficeMouse>(officeMouse);
		
	}

}