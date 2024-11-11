package e04_example;

public class ForeignWorker extends Employee{
	private int risk;
	//1 - 기존 급여의 2배, 2 - 기존 급여의 1.5배, 3 - 1.2배

	public ForeignWorker(int salary, String name, int risk) {
		super(salary, name);
		this.risk = risk;
	}

	@Override
	public int getPay() {
		int result = salary / 12;
		switch(risk) {
		case 3:
			result *= 1.2;
			break;
		case 2:
			result *= 1.5;
			break;
		case 1:
			result *= 2;
			break;
		}
		
		return result;
	}
}
	

	
	

