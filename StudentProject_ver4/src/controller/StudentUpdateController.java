package controller;

import java.util.Scanner;

import dto.Student;
import service.StudentService;

public class StudentUpdateController implements Controller {

	@Override
	public void execute() {
		
		// 1. 수정할 학번 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 학번을 입력하세요 >> ");
		String studentNo = sc.nextLine();
		
		// 2. 서비스에 해당 학생 정보 검색 결과 받기
		Student student = StudentService.getInstance().searchStudent(studentNo);
		
		// 3-1. 검색 결과가 없으면 작업 중단, 메세지 출력
		if(student == null) {
			System.out.println("해당 학생 정보가 없습니다.");
			return;
		}
		
		// 3-2. 이름, 학과명, 평점 받아서 저장
		System.out.print("수정될 학번을 입력하세요 >> ");
		student.setStudentNo(sc.nextLine());

		System.out.print("수정될 이름을 입력하세요 >> ");
		student.setStudentName(sc.nextLine());

		System.out.print("수정될 전공을 입력하세요 >> ");
		student.setMajorName(sc.nextLine());

		System.out.print("수정될 학점을 입력하세요 >> ");
		student.setScore(sc.nextDouble());

		System.out.println("수정된 학생 정보 : " + student + "\n---------------------------------------------");

	}

}
