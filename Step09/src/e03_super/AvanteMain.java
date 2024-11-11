package e03_super;

public class AvanteMain {
	public static void main(String[] args) {
		AvanteN a = new AvanteN();
		a.changeMode();
		a.changeMode();
		a.changeMode();
		for(int i = 0; i < 15; i++) {
			a.accelRate();
		}
		a.changeMode();
		for(int i = 0; i < 14; i++) {
			a.breakRate();
		}
		for(int i = 0; i < 60; i++) {
			a.accelRate();
		}

	}
}
