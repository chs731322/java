package e01_object;

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

	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", studentName=" + studentName + ", majorName=" + majorName
				+ ", score=" + score + "]";
	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Student))
//			return false;
//		Student other = (Student) obj;
//		if (majorName == null) {
//			if (other.majorName != null)
//				return false;
//		} else if (!majorName.equals(other.majorName))
//			return false;
//		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
//			return false;
//		if (studentName == null) {
//			if (other.studentName != null)
//				return false;
//		} else if (!studentName.equals(other.studentName))
//			return false;
//		if (studentNo == null) {
//			if (other.studentNo != null)
//				return false;
//		} else if (!studentNo.equals(other.studentNo))
//			return false;
//		return true;
//	}
	
	
	
	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return Objects.hash(majorName, score, studentName, studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(majorName, other.majorName)
				&& Double.doubleToLongBits(score) == Double.doubleToLongBits(other.score)
				&& Objects.equals(studentName, other.studentName) && Objects.equals(studentNo, other.studentNo);
	}

	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == this) return true;
//		if(obj == null) return false;
//		if(obj instanceof Student) {
//			Student temp = (Student) obj;
//			return temp.studentNo.equals(studentNo) 
//					&& studentName.equals(studentName)
//					&& majorName.equals(majorName)
//					&& score == temp.score;
//		}
//		return super.equals(obj);
//	
//	}
	
	
}
