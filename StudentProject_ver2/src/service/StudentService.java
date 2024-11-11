package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;

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

	public void insertStudent() {
		// 학생 정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== 학생 정보 등록 ===========");
		String studentNo = "";
		while (true) {
			System.out.print("학번을 입력하세요 >> ");
			studentNo = sc.nextLine();
			// 학번 중복 체크
			if (searchStudent(studentNo) != null) {
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

		// 리스트에 학생정보 추가
		list.add(new Student(studentNo, studentName, majorName, score));

	}

	// 학생 정보를 학번으로 검색
	private Student searchStudent(String studentNo) {

		// 매개변수로 받은 학번과 동일한 학번이 있으면 해당 객체를 student에 저장
		for (Student std : list) {
			if (std.getStudentNo().equals(studentNo))
				return std;
		}
		return null;
	}

	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		System.out.print("검색할 학번을 입력하세요 >> ");
		studentNo = sc.nextLine();

		Student std = searchStudent(studentNo);

		if (std == null) {
			System.out.println("해당 학생 정보가 없습니다.");
		} else
			System.out.println(searchStudent(studentNo));

	}

	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 학번을 입력하세요 >> ");
		String studentNo;
		studentNo = sc.nextLine();

		Student std = searchStudent(studentNo);

		if (std == null) {
			System.out.println("해당 학생 정보가 없습니다.");
		} else {
			list.remove(std);
			System.out.println("------------- 데이터 삭제 완료 -------------");
		}
	}

	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 학번을 입력하세요 >> ");
		String studentNo = sc.nextLine();

		Student std = searchStudent(studentNo);

		if (std == null) {
			System.out.println("해당 학생 정보가 없습니다.");
			return;
		} else
			System.out.println(std);

		System.out.print("수정될 학번을 입력하세요 >> ");
		String studentNo2 = sc.nextLine();
		std.setStudentNo(studentNo2);

		System.out.print("수정될 이름을 입력하세요 >> ");
		String studentName2 = sc.nextLine();
		std.setStudentName(studentName2);

		System.out.print("수정될 전공을 입력하세요 >> ");
		String majorName2 = sc.nextLine();
		std.setMajorName(majorName2);

		System.out.print("수정될 학점을 입력하세요 >> ");
		double score2 = sc.nextDouble();
		std.setScore(score2);

		System.out.println("수정된 학생 정보 : " + std + "\n---------------------------------------------");

	}

	public void printStudentInfo() {
		// 전체 학생 정보 출력
		System.out.println("======== 전제 학생 정보를 출력합니다. ========");

		for (Student str : list)
			System.out.println(str);

	}

	public void searchStudentName() {
		// 학생 이름 일부 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 >> ");
		String studentName = sc.nextLine();

		int count = 0;
		// 입력한 검색어가 학생 이름에 있는지 확인 후 출력
		for(Student std : list) {
			if(std.getStudentName().indexOf(studentName) != -1) {
				System.out.println("학생 정보 : " + std);
				count++;
			}
		}
		
		// 검색 결과가 없을 때 출력
		if (count == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

}