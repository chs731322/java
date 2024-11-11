package e02_random;

import java.util.Arrays;
import java.util.Random;

public class E19_Lotto {
	//로또 번호 한 세트 리턴하는 메서드
	public static int[] returnLotto() {
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			int n = randomNumber();
			if(isDuplicateNumber(arr, n)) {
				i--;
				continue;
			}
			arr[i] = n;
		}
		return arr;
	}
	
	//1-45 숫자 리턴하는 메서드
	public static int randomNumber() {
		Random r = new Random();
		return r.nextInt(45) + 1;
	}
	
	//로또 번호 한 세트 출력하는 메서드
	//숫자를 두자리씩 출력
	public static void printLottoNum(int[] arr) {
		for(int n : arr) {
			System.out.printf("%02d  ", n);
		}
		System.out.println();
	}
	
	//중복 체크하는 메서드
	public static boolean isDuplicateNumber(int[] arr, int n) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		for (int k = 0; k < 5; k++) {
//			int[] arr = new int[7];
			
//			for (int i = 0; i < arr.length; i++) {
//				int n = randomNumber();
//				if(isDuplicateNumber(arr, n)) {
//					i--;
//					continue;
//				}
//				arr[i] = n;
//			}
//			
			//출력
			printLottoNum(returnLotto());
		}
	}
}
