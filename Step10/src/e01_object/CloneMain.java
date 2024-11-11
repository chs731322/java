package e01_object;

public class CloneMain {
	public static void main(String[] args) {
		Point p1 = new Point(10, 7);
		Point p2 = p1.clone();
		
		System.out.println(p1);
		System.out.println(p2);	// 내용은 같으나
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2)); // 별도로 존재
		
		p1.setX(50);
		System.out.println(p1);
		System.out.println(p2);	
		
		/*
		 * 결과값
		 * 
		 * x=10, y=7 
		 * x=10, y=7 
		 * 1818402158 
		 * 1590550415 
		 * x=50, y=7 
		 * x=10, y=7
		 * 
		 */
		
	}
}