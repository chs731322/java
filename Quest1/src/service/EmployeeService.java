package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.EmployeeVO;

public class EmployeeService {
	private ArrayList<EmployeeVO> list;
	private Scanner sc = new Scanner(System.in);

	public EmployeeService() {
		list = new ArrayList<EmployeeVO>();

		list.add(new EmployeeVO("E001", "김철수", "매니저", "인사부", 2500));
		list.add(new EmployeeVO("E002", "이영희", "개발자", "IT부서", 2800));
		list.add(new EmployeeVO("E003", "박민수", "분석가", "재무부", 4500));
		list.add(new EmployeeVO("E004", "최유리", "디자이너", "마케팅부", 3500));
		list.add(new EmployeeVO("E005", "정현우", "사원", "영업부", 3000));

	}

	public void insertEmployee() {

		System.out.println("사원정보 등록을 시작합니다..........");
		// 사원데이터 입력
		// 사번 입력시 중복 처리 부분 추가
		String employeeNo = null;
		while (true) {
			System.out.print("사원번호 입력 : ");
			employeeNo = sc.nextLine();
			EmployeeVO vo = new EmployeeVO(employeeNo, null, null, null, 0);
			if (list.contains(vo)) {
				System.out.println("중복된 사원번호입니다. 다시 입력하세요.");
				continue;
			}
			break;
		}
		System.out.print("사원명 입력 : ");
		String name = sc.nextLine();
		System.out.print("직급 입력 : ");
		String position = sc.nextLine();
		System.out.print("부서 입력 : ");
		String department = sc.nextLine();
		System.out.print("연봉 입력 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		list.add(new EmployeeVO(employeeNo, name, position, department, salary));
		System.out.println("사원 정보 등록 성공");
	}

	public void printAllEmployee() {
		System.out.println("전체 사원 정보를 출력합니다..........");
		if (list.isEmpty()) {
			System.out.println("저장된 데이터가 없습니다.");
			return;
		}
		for (int i = 0; i < list.size(); i++)
			list.get(i).printEmployeeInfo();
	}

}