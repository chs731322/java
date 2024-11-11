package e01_class;

public class AirconMain {

	public static void main(String[] args) {
		AirCon air = new AirCon();
		air.powerOnOff();
		for(int i = 0; i < 5; i++)
			air.tempDown();
		air.changeWind();
		air.changeWind();
		air.changeWind();
		air.changeWind();
		air.changeWind();
		
		air.changeMode();
		air.changeMode();
		air.changeMode();
		air.changeMode();
		air.changeMode();
		air.changeMode();
	}

}
