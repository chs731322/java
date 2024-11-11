package e03_constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("20221234", "김현오", "부장", "총무부", 7200);
		Employee emp2 = new Employee("20212356", "김철수", "이사", "회계부", 8400);
		
		emp1.printEmployeeInfo();
		emp2.printEmployeeInfo();
	}

}