package service;

import java.util.Scanner;

import dto.Student;

//	학생 데이터를 배열로 관리
//	작업 배열에 학생 데이터 추가, 삭제, 검색, 수정

public class StudentService {

	// 학생 정보 저장할 배열
	private Student[] arr;

	// 배열을 관리할 인덱스
	private int idx;

	public StudentService() {
		arr = new Student[5];
		arr[0] = new Student("20220754", "조해솔", "멀티미디어학과", 4.17);
		arr[1] = new Student("20191111", "김현오", "컴퓨터공학과", 3.19);
		arr[2] = new Student("20221043", "권영웅", "멀티미디어학과", 3.92);
		idx = 3;
	}

	// 추가
	// 학번, 이름, 학과명, 점수를 입력 받아 배열에 추가
	public void insertStudent() {

		// 1. 학번, 이름 , 학과명, 점수 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== 학생 정보 등록 ===========");
		System.out.print("학번을 입력하세요 >> ");
		String studentNo = sc.nextLine();
		System.out.print("이름을 입력하세요 >> ");
		String studentName = sc.nextLine();
		System.out.print("전공을 입력하세요 >> ");
		String majorName = sc.nextLine();
		System.out.print("점수를 입력하세요 >> ");
		double score = sc.nextDouble();

		arr[idx++] = new Student(studentNo, studentName, majorName, score);

//		//2. Student 객체 생성
//		Student student = new Student(studentNo, studentName, majorName, score);
//		
//		//3. 배열에 등록
//		arr[idx] = student;
//		
//		//4. idx 증가
//		idx++;

		// 배열 길이 늘리기
		if (idx == arr.length) {
			// 1. 임시 배열
			Student[] temp = new Student[arr.length + 5];
			// 2. 배열 내용 복사
			System.arraycopy(arr, 0, temp, 0, arr.length);
			// (원본 배열, 원본 배열에서 복사 시작할 인덱스, 새 배열, 새 배열에서 복사 시작할 인덱스, 복사할 길이)
			// 3. 배열 연결
			arr = temp;
		}

	} // insertStudent

	// 삭제 delete

	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n삭제할 학번을 입력하세요 >> ");
		String studentNo;
		studentNo = sc.nextLine();

		int index = searchStudent(studentNo);

		if (index == -1) {
			System.out.println("\n해당 학생 정보가 없습니다.\n");
			return;
		} else {
			for (int i = index; i < idx - 1; i++) {
				arr[i] = arr[i + 1];
			}
			idx--;
			System.out.println("------------- 데이터 삭제 완료 -------------");
		}
	}

	// 검색 search
	private int searchStudent(String studentNo) {
		// 반복문 이용해서 동일 학번을 찾음
		for (int i = 0; i < idx; i++) { // arr.length라고 하면 this.arr[i] = null이기 때문에 에러
			// 찾으면 해당 인덱스 번호 리턴
			if (arr[i].getStudentNo().equals(studentNo)) {
				return i;
			}
		}
		// 검색 결과가 없으면 인덱스 번호 -1 리턴
		return -1;

	}

	public void searchStudent() {
		// 학번 입력 받아서
		Scanner sc = new Scanner(System.in);
		System.out.print("\n검색할 학번을 입력하세요 >> ");
		String studentNo;
		studentNo = sc.nextLine();

		int index = searchStudent(studentNo);

		if (index == -1)
			System.out.println("\n해당 학생 정보가 없습니다.\n");
		else
			System.out.println(arr[index]);
	}

	// 수정 modify

	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n수정할 학번을 입력하세요 >> ");
		String studentNo = sc.nextLine();

		int index = searchStudent(studentNo);

		if (index == -1) {
			System.out.println("\n해당 학생 정보가 없습니다.\n");
			return;
		} else
			System.out.println(arr[index]);

		System.out.print("\n수정될 학번을 입력하세요 >> ");
		String studentNo2 = sc.nextLine();
		arr[index].setStudentNo(studentNo2);

		System.out.print("\n수정될 이름을 입력하세요 >> ");
		String studentName2 = sc.nextLine();
		arr[index].setStudentName(studentName2);

		System.out.print("\n수정될 전공을 입력하세요 >> ");
		String majorName2 = sc.nextLine();
		arr[index].setMajorName(majorName2);

		System.out.print("\n수정될 학점을 입력하세요 >> ");
		double score2 = sc.nextDouble();
		arr[index].setScore(score2);

		System.out.println("\n수정된 학생 정보 : " + arr[index] + "\n");
	}

	// 전체 출력 print
	public void printStudentInfo() {
		System.out.println("\n학생 정보 전체를 출력합니다...\n");
		// 1. idx전까지 모든 학생 정보를 출력
		for (int i = 0; i < idx; i++)
			System.out.println("학생 정보 : " + arr[i]);
		System.out.println("=============== 출력 완료 =================\n");
	}

	// 학생 정보 이름 일부를 검색하여 일부가 일치하면 출력
	public void searchStudentName() {
		// 학생 이름 일부 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("\n검색할 이름을 입력하세요 >> ");
		String studentName = sc.nextLine();
		
		int count = 0;
		//입력한 검색어가 학생 이름에 있는지 확인 후 출력
		for (int i = 0; i < idx; i++) { 
			if (arr[i].getStudentName().indexOf(studentName) != -1) {
				System.out.println("학생 정보 : " + arr[i]);
				count++;
			}
		}
		// 검색 결과가 없을 때 출력
		if (count == 0) {
			System.out.println("검색 결과가 없습니다.");
		}

	}

}
