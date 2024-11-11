package e05_quest;

public class IotMain {

	public static void main(String[] args) {

		IotApp app = new IotApp();
		
		app.powerAllOn();
		app.powerAllOff();
		app.addDevice(new TV());
		app.addDevice(new Boiler());
		app.powerAllOn();
		
	}

}