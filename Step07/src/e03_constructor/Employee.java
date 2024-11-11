package e03_constructor;

public class Employee {
	// 사번 - String
	String employeeNo;
	// 이름 - String
	String employeeName;
	// 직급 - String
	String positionName;
	// 부서 - String
	String departmentName;
	// 연봉 - int
	int employeeSalary;
	
	// 모든 필드 초기화하는 생성자
	Employee(String employeeNo, String employeeName, String positionName,
			String departmentName, int employeeSalary) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.positionName = positionName;
		this.departmentName = departmentName;
		this.employeeSalary = employeeSalary;
	}
	// 사원정보 출력하는 메서드
	void printEmployeeInfo() {
		System.out.println(employeeNo + " " + employeeName + " " + positionName + " " + departmentName + " " + employeeSalary);
	}
	// EmployeeMain 클래스 작성해서 작성한 Employee 클래스 생성해서 테스트
}
