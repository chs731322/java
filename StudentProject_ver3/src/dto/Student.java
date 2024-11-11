package dto;

import java.util.Objects;

public class Student {
	private String studentNo;
	private String studentName;
	private String majorName;
	private double score;

	public Student(String studentNo, String studentName, String majorName, double score) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return studentNo + " / " + studentName + " / " + majorName + " / " + score;
	}

	// 객체를 비교할 equals, hashCode
	// 객체의 내용을 비교할 때 학번만 이용
	
	@Override
	public int hashCode() {
		return Objects.hash(studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())  // 현재 객체와 obj의 클래스 타입이 다르면 false 반환 (다른 클래스끼리는 비교 불가능)
			return false;
		Student other = (Student) obj;	// obj를 Student 타입으로 캐스팅 (이후 studentNo 필드 비교를 위해)
		return Objects.equals(studentNo, other.studentNo);	 // studentNo 필드를 비교하여 동일하면 true, 다르면 false 반환
	}

}
