package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;
import exception.StudentException;

public class StudentService {
	// 싱글톤 패턴 적용

	private static StudentService instance = new StudentService();
	private ArrayList<Student> list;

	private StudentService() {
		list = new ArrayList<Student>();

		list.add(new Student("20220754", "조해솔", "멀티미디어학과", 4.17));
		list.add(new Student("20191111", "김현오", "컴퓨터공학과", 3.19));
		list.add(new Student("20221043", "권영웅", "멀티미디어학과", 3.92));
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public boolean insertStudent(Student student) throws StudentException {
		if(searchStudent(student.getStudentNo()) != null) {
			throw new StudentException("학번이 중복되었습니다.");
		}
		// 리스트에 학생정보 추가
		return list.add(student);

	}

	public Student searchStudent(String studentNo) {

		int idx = list.indexOf(new Student(studentNo, null, null, 0));

		if (idx == -1)
			return null;
		else
			return list.get(idx);

	}

	public boolean deleteStudent(String studentNo) {
		return list.remove(new Student(studentNo, null, null, 0));
	}

	public ArrayList<Student> searchStudentName(String name) {
		// 검색 결과 저장할 리스트
		ArrayList<Student> result = new ArrayList<Student>();

		// 입력한 검색어가 학생 이름에 있는지 확인 후 출력
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentName().indexOf(name) != -1) {
				result.add(list.get(i));
			}
		}
		return result;
	}

}