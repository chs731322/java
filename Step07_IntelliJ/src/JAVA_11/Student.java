package JAVA_11;


public class Student {
    String studentNo;
    String studentName;
    String majorName;
    double score;


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


    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", majorName='" + majorName + '\'' +
                ", score=" + score +
                '}';
    }


}

