package e01_class;

import java.util.Scanner;

public class Employee {

	//==필드==
	//사번 - String
	String employeeNo;
	//이름 - String
	String employeeName;
	//성별 - boolean
	boolean employeeGender;
	//직급 - String
	String positionName;
	//부서 - String
	String departmentName;
	//연봉 - int
	int employeeSalary;
	
	//==메서드==
	//사원 정보 출력
	void printEmployeeInfo() {
		//String gender = employeeGender ? "남" : "여";
		System.out.printf("%s %s(%s) %s %s %d\n"
				, employeeNo, employeeName, checkGender(), positionName, departmentName, employeeSalary);
	}
	//사원 정보 초기화
	void init(String no, String name, boolean gender, String position, String department, int salary) {
		employeeNo = no;
		employeeName = name;
		employeeGender = gender;
		positionName = position;
		departmentName = department;
		employeeSalary = salary;
	}
	
	//성별 구하는 메서드
	String checkGender() {
		String result = "여";
		if(employeeGender) // true of false
			result = "남";
		return result;	// 메서드가 void가 아니기 때문에 return을 반드시 넣어줘야 함
	}
	
	//연봉 정보 수정 메서드
	//연봉 값은 2400이상인 값이 들어와야 함, 미만일 경우 연봉 오류 출력
	boolean updateSalary(int salary) {
		if(salary >= 2400) {
			employeeSalary = salary;
			return true;
		}
		return false;
	}
	
}