package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		StudentService service = StudentService.getInstance();

		while (true) {
			System.out.println("학적 관리 프로그램 버전 - 3");
			System.out.println("1. 학생 데이터 등록");
			System.out.println("2. 학생 데이터 검색");
			System.out.println("3. 학생 데이터 삭제");
			System.out.println("4. 학생 데이터 수정");
			System.out.println("5. 학생 데이터 전체 출력");
			System.out.println("6. 학생 이름 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 >> ");
			// 메뉴 번호 입력 받음
			int no = sc.nextInt();
			
			//0일 때 종료
			if(no == 0) return;
			//controller 받아옴
			Controller controller = HandlerMapping.getInstance().createController(no);
			
			//작업 시작
			if(controller != null)
				controller.execute();
		}
	}

}
