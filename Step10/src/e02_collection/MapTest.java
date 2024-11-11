package e02_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Point> map = new HashMap<String, Point>();

		// 데이터 추가
		map.put("A", new Point(10, 7));
		map.put("B", new Point(21, 14));
		map.put("Enemy", new Point(121, 78));
		map.put("Player", new Point(5, 10));
		map.put("B", new Point(33, 24));

		System.out.println(map);
		// 데이터 꺼내기 - 키 값 이용
		System.out.println(map.get("Player"));
		System.out.println(map.get("B"));

		// 전체 데이터 꺼내기
		Set<String> key = map.keySet();
		
		// 1
		for (String k : key) {
			System.out.println(k + " " + map.get(key));
		}
		
		// 2
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k + " " + map.get(key));
		}
		
		//키 값에 해당하는 데이터가 없으면 null
		System.out.println(map.get("C"));
		
		//데이터 삭제
		map.remove("B");
		System.out.println(map);
		
		//맵에 저장된 데이터 개수
		System.out.println(map.size());
		
		//맵에 해당 키 값이 있는가
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("B"));
		
		System.out.println("=====================================");
		//맵에 해당 데이터가 있는가 //equals 실행
		System.out.println(map.containsValue(new Point(10, 7)));
		System.out.println(map.containsValue(new Point(10, 6)));
		
		//맵 내용 비우기
		map.clear();
		System.out.println(map);
		
		//맵 내용 비었는가
		System.out.println(map.isEmpty());
		
	}
}