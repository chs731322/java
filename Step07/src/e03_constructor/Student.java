package e03_constructor;

public class Student {

	//학번
	//이름
	//학과명
	//평점
	
	String studentNo;
	String studentName;
	String majorName;
	double score;
	
	//모든 필드를 초기화하는 생성자
	Student(String studentNo, String name, String major, double s) {
		//this 자기 자신 객체를 나타내는 키워드
		
		this.studentNo = studentNo;
		studentName = name;
		majorName = major;
		score = s;
	}
	//학생 정보를 출력하는 메서드
	

	void printStudentInfo() {
		System.out.printf("%s %s %s %.2f\n", studentNo, studentName, majorName, score);
	}

}
