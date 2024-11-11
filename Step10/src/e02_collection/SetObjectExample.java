package e02_collection;

//import java.util.HashSet;
import java.util.TreeSet;

public class SetObjectExample {

	public static void main(String[] args) {
//		HashSet<Point> set = new HashSet<Point>();
		TreeSet<Point> set = new TreeSet<Point>();
		
		// set에 Point 데이터 5건 저장, 그 중에 한 건은 동일한 객체 저장
		set.add(new Point(5, 2));
		set.add(new Point(3, 4));
		set.add(new Point(7, 9));
		set.add(new Point(1, 8));
		set.add(new Point(5, 2));
		
		// set 내용 출력
		System.out.println(set);
	}

}