package e02_collection;

import java.util.ArrayList;
import java.util.Random;

public class LIstObjectExample {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point>();

		// 리스트에 데이터 10건
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
            list.add(new Point(r.nextInt(10), r.nextInt(10)));
        }

        // 추가된 데이터 출력 (예시)
        for (Point p : list) {
            System.out.println(p);
        }
        
        Point search = new Point(7, 9);
        System.out.println(list.contains(search)); // 해당 데이터가 리스트에 있는지 boolean으로 리턴
        System.out.println(list.indexOf(search)); // 해당 데이터가 리스트에 있으면 인덱스 번호 리턴, 없으면 -1 리턴
        System.out.println(list.remove(search));
        System.out.println(list);
        
	}
}