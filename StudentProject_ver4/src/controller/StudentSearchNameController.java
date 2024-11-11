package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;
import service.StudentService;

public class StudentSearchNameController implements Controller {

	@Override
	public void execute() {
		// 학생 이름 일부 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 >> ");
		String studentName = sc.nextLine();

		ArrayList<Student> list = StudentService.getInstance().searchStudentName(studentName);
		
		if(list.isEmpty()) 
			System.out.println("해당 학생 정보가 없습니다.");
		else {
			for(Student student : list)
				System.out.println(student);
		}
	}

}
