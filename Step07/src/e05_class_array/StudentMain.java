package e05_class_array;

public class StudentMain {
	
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		
		arr[0] = new Student("1111", "김철수", "컴퓨터공학과", 3.5);
		System.out.println(arr[0].toString());
	}

}
