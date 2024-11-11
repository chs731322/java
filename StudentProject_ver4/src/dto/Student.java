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
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNo, other.studentNo);
		
	}

}
