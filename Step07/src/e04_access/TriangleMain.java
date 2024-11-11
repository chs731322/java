package e04_access;
/*
 * 생성자가 private 이면 외부에서 생성 불가
 * 
 */
public class TriangleMain {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(3, 5);
		System.out.println(t1);
	}

}
