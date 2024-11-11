package e02_collection;

import java.util.Random;
import java.util.TreeSet;

public class LottoMain {
	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		
		//------------------
		//로또 번호 한 세트 생성
		while(set.size() < 6) {
			set.add(r.nextInt(45)+1);
		}
		
		//------------------
		System.out.println(set);
	}

}