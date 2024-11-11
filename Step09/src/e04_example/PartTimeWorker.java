package e04_example;

public class PartTimeWorker extends Employee {
	// 일한 시간, 시급

	private int time;
	private int payPerHour;

	public PartTimeWorker(String name, int time, int payPerHour) {
		super(0, name);
		this.time = time;
		this.payPerHour = payPerHour;
	}

	@Override
	public int getPay() {
		return time * payPerHour / 10000;
	}

}
