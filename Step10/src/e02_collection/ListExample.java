package e02_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {
	/*
	 * List 특징
	 * 
	 * 1. 데이터 중복 2. 리스트에 저장된 데이터 순서가 보장됨
	 * 
	 * ArrayList : 리스트에서 데이터를 배열로 관리 
	 * LinkedList : 리스트에서 데이터를 노드 단위로 관리 
	 * Vector : ArrayList와 동일, 동기화가 추가
	 * 
	 */

	public static void main(String[] args) {
		// 리스트 생성
		// ArrayList <리스트에 저장할 데이터의 참조형 타입>
//		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
		Vector<String> list = new Vector<String>();

		// 데이터 추가
		list.add("HTML");
		list.add("JAVA");
		list.add("jsp");
		list.add("React");
		list.add("jQuery");
		list.add("CSS");
		list.add("JAVA");
		list.add("React");

		System.out.println(list);

		// 데이터 삭제 - 인덱스 번호로 삭제
		list.remove(1);
		System.out.println(list);

		// 데이터 삭제 - 데이터 값을 기준으로 삭제, 첫번째로 검색된 값 1개만 삭제
		list.remove("jsp");
		System.out.println(list);

		// 리스트에 저장된 데이터 개수
		System.out.println(list.size());

		// 리스트에 저장된 데이터를 교체
		list.set(1, "C언어");
		System.out.println(list);

		// 데이터를 원하는 인덱스 위치에 추가
		list.add(1, "C++");
		System.out.println(list);

		// 해당 데이터가 리스트에 있는지
		System.out.println(list.contains("React")); // true
		System.out.println(list.contains("SQL")); // false

		// 데이터가 몇 번째 위치에 있는지
		System.out.println(list.indexOf("React")); // 6
		System.out.println(list.indexOf("SQL")); // -1

		// 리스트에 있는 모든 데이터를 삭제
		list.clear();
		// list.removeAll(list);
		System.out.println(list);

		// 리스트에 내용이 하나도 없는지
		System.out.println(list.isEmpty()); // true

		
		// ------------------------
		list.add("HTML");
		list.add("JAVA");
		list.add("jsp");
		list.add("React");
		list.add("jQuery");
		list.add("CSS");
		list.add("JAVA");
		list.add("React");
		// ------------------------
		
		// 데이터 꺼내는 방법 1
		for (int i = 0; i < list.size(); i++) {
			// 인덱스 번호를 이용해서 꺼냄
			System.out.println(list.get(i));
		}
		
		// 데이터 꺼내는 방법 2
		// for each문 데이터를 리스트에서 복사 받아서 이용
		for(String str : list) {
			System.out.println(str);
		}
		
		// 데이터 꺼내는 방법 3
		// Collection이 공통적으로 데이터를 처음부터 마지막까지 접근할 때 사용
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) { // 다음 위치에 데이터가 있는지 판단
			System.out.print(it.next() + " "); // 다음 위치로 이동한 다음 데이터 리턴
		}
		
	}

}
