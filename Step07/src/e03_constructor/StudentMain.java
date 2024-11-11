package e03_constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student("20220754", "김철수", "컴퓨터공학과", 4.17);
		Student std2 = new Student("20110234", "김현오", "무슨과", 4.5);
		
		std1.printStudentInfo();
		std2.printStudentInfo();
	}

}
