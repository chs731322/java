package e02_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	/*
	 * Set
	 * 
	 * 1. 데이터를 중복해서 저장하지 않음 (고유값만 저장) 
	 * 2. 자동 정렬
	 * 
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		// 추가
		set.add("JAVA");
		set.add("HTML");
		set.add("CSS");
		set.add("React");
		set.add("C#");
		set.add("C++");
		set.add("jQuery");
		set.add("JAVA"); // 데이터를 중복해서 저장하지 않음
		System.out.println(set);

		// 삭제
		set.remove("C#");
		System.out.println(set);

		// 데이터 개수
		System.out.println(set.size());

		// 데이터 검색
		System.out.println(set.contains("React"));
		System.out.println(set.contains("C#"));

		// 내용비우기
		set.clear();
		System.out.println(set);

		// set이 비어있는가
		System.out.println(set.isEmpty());

		// --------------------------
		set.add("JAVA");
		set.add("HTML");
		set.add("CSS");
		set.add("React");
		set.add("C#");
		set.add("C++");
		set.add("jQuery");
		set.add("JAVA");
		// --------------------------

		// 데이터 전체 조회 1
		for (String str : set) {
			System.out.println(str);
		}

		// 데이터 전체 조회 2
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//set > list 변환
		ArrayList<String> list = new ArrayList<String>(set);
		
		System.out.println(list);
		
		//list > set 변환
		HashSet<String> s = new HashSet<String>(list);
		System.out.println(s);
		
	}

}
