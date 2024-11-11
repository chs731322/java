package e01_class;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student(); // 학생 데이터 저장할 인스턴스 생성
		Student std2 = new Student();
		// 데이터 초기화
//		std1.studentNo = "20111234";
//		std1.studentName = "김철수";
//		std1.majorName = "컴퓨터공학과";
//		std1.score = 3.14;

		std1.init("20111234", "김철수", "컴퓨터공학과", 3.14); // 인자값 (= argument)

		std1.printStudentInfo();

//		std2.studentNo = "20220754";
//		std2.studentName = "조해솔";
//		std2.majorName = "멀티미디어학과";
//		std2.score = 4.17;

		std2.init("20220754", "조해솔", "멀티미디어학과", 4.17);

		std2.printStudentInfo();
	}

}
