package controller;

import java.util.Scanner;

import service.StudentService;

public class StudentDeleteController implements Controller {

	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		boolean result = StudentService.getInstance()
				.deleteStudent(studentNo);
		
		if(result)
			System.out.println("학생정보 삭제 완료");
		else
			System.out.println("학생정보 삭제 실패");
			
	}

}
