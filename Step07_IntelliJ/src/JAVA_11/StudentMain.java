package JAVA_11;

public class StudentMain {

    public static void main(String[] args) {

        Student[] s1 = new Student[4];

        s1[0] = new Student("20220754", "조해솔", "멀티미디어학과", 4.17);
        s1[1] = new Student("203454", "김해솔", "멀티미디어학과", 4.17);
        s1[2] = new Student("20223454", "이해솔", "멀티미디어학과", 4.17);
        s1[3] = new Student("20226654", "박해솔", "멀티미디어학과", 4.17);

        for (int i = 0; i < s1.length; i++)
            System.out.println(s1[i]);
    }

}