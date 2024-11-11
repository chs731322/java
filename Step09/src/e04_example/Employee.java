package e04_example;

public class Employee {
	//연봉
	protected int salary;
	//이름
	protected String name;
	
	public Employee(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
	
	//연봉 계산해서 리턴하는 메서드
	public int getPay() {
		return salary;
	}
	//이름, 연봉 정보 출력하는 메서드
	public void printInfo() {
		System.out.println("이름 : " + name + " / 연봉 : " + getPay());
	}
	//직원이 할 일
	public void work() {
		System.out.println("직원이 일을 합니다.");
	}
}