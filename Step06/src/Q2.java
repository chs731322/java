import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
//		정수형 배열 길이가 10인 배열을 생성한 뒤 숫자를 전부 입력 받아 배열에 저장
//		배열에 있는 숫자를 홀수 먼저 전부 출력, 짝수 전부 출력
//
//		홀수 >> 1 3 5 7 9
//		짝수 >> 2 4 6 8
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		System.out.print("");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 숫자 입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\n홀수 : ");
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1)
				System.out.print(arr[i] + " ");
		}
		System.out.print("\n짝수 : ");
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}

	}

}
