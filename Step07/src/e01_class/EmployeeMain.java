package e01_class;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.init("32401043", "김철수", true, "부장","총무부", 7200);
		
		emp.printEmployeeInfo();
		System.out.println(emp.updateSalary(7300));
		System.out.println(emp.updateSalary(2300));
	}
}