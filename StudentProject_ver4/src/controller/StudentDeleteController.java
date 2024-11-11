package controller;

import java.util.Scanner;

import dto.Student;
import service.StudentService;

public class StudentDeleteController implements Controller{

	@Override
	public void execute() {
		StudentService service = StudentService.getInstance();

		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 학번을 입력하세요 >> ");
		String studentNo;
		studentNo = sc.nextLine();

		boolean result = StudentService.getInstance().deleteStudent(studentNo);
		
		if (result) {
			System.out.println("------------- 데이터 삭제 완료 -------------");
		} else {
			System.out.println("해당 학생 정보가 없습니다.");
		}
		
	}

}