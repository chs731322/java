package e04_example;

public class PermantWorker extends Employee {

	public PermantWorker(int salary, String name) {
		super(salary, name);
	}

	@Override
	public int getPay() {
		return salary / 12;
	}
	
}