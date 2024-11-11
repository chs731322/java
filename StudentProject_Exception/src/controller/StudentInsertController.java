package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import dto.Student;
import exception.StudentException;
import service.StudentService;

public class StudentInsertController implements Controller {

	@Override
	public void execute() {

		StudentService service = StudentService.getInstance();

		// 사용자로부터 데이터 입력 받음
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== 학생 정보 등록 ===========");
		String studentNo = "";
		System.out.print("학번을 입력하세요 >> ");
		studentNo = sc.nextLine();
		System.out.print("이름을 입력하세요 >> ");
		String studentName = sc.nextLine();
		System.out.print("전공을 입력하세요 >> ");
		String majorName = sc.nextLine();
		System.out.print("점수를 입력하세요 >> ");
		double score = sc.nextDouble();
		sc.nextLine();

		// 서비스 클래스로 입력 받은 데이터를 전달
			boolean result = service.insertStudent(new Student(studentNo, studentName, majorName, score));
		} catch (StudentException e) {
			System.out.println("학생 정보 등록 실패");
		} catch (InputMismatchException e) {
			System.out.println("평점은 숫자로 입력해야 합니다.");
		}

//		// 서비스 클래스가 일한 결과를 받아서 출력
//		if (result)
//			System.out.println("학생 정보 추가 완료..");
//		else
//			System.out.println("학생 정보 추가 실패!!");
	}

}
