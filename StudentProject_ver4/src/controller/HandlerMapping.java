package controller;

public class HandlerMapping {

	// 싱글톤 패턴 적용
	private static HandlerMapping instance;

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		if (instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	// 작업자를 생성해서 리턴하는 메서드
	public Controller createController(int no) {
		Controller controller = null;

		switch (no) {
		case 1:
			controller = new StudentInsertController();
			break;
		case 2:
			controller = new StudentSearchController();
			break;
		case 3:
			controller = new StudentDeleteController();
			break;
		case 4:
			controller = new StudentUpdateController();
			break;
		case 5:
			controller = new StudentPrintAllController();
			break;
		case 6:
			controller = new StudentSearchNameController();
			break;
		}
		return controller;
	}
}