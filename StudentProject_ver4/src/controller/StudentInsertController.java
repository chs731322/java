package controller;

import java.util.Scanner;

import dto.Student;
import service.StudentService;

public class StudentInsertController implements Controller {

	@Override
	public void execute() {

		StudentService service = StudentService.getInstance();

		// 사용자로부터 데이터 입력 받음
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== 학생 정보 등록 ===========");
		String studentNo = "";
		while (true) {
			System.out.print("학번을 입력하세요 >> ");
			studentNo = sc.nextLine();
			// 학번 중복 체크
			if (service.getList().contains(new Student(studentNo, null, null, 0))) { // 임시로 객체를 만들어서 비교해줘야 함
				// list.contains(studentNo) X
				// list에서 contains, indexOf에서 실행되는 equals는
				// 리스트 요소의 equals가 아니라 비교할 대상의 equals를 쓰기 때문에 String으로 검색할 수 없다
				System.out.println("이미 등록된 학번입니다. 학번을 다시 입력해주세요.");
				continue;
			}
			break;
		}

		System.out.print("이름을 입력하세요 >> ");
		String studentName = sc.nextLine();
		System.out.print("전공을 입력하세요 >> ");
		String majorName = sc.nextLine();
		System.out.print("점수를 입력하세요 >> ");
		double score = sc.nextDouble();
		sc.nextLine();

		// 서비스 클래스로 입력 받은 데이터를 전달
		boolean result = service.insertStudent(new Student(studentNo, studentName, majorName, score));

		// 서비스 클래스가 일한 결과를 받아서 출력
		if (result)
			System.out.println("학생 정보 추가 완료..");
		else
			System.out.println("학생 정보 추가 실패!!");
	}

}
