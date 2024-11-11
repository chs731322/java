package e02_method;

import java.util.Scanner;

public class E02_SortArray {

	// 배열 출력
	static void printArray(int pass, int[] arr) {
		System.out.print(pass + "pass : ");
		for (int n : arr)
			System.out.printf("%d ", n);
		System.out.println();
	}

	static void bubble(int[] arr) {
		// 버블 정렬
		// 정렬을 (배열 길이 - 1)번 만큼 수행

		for (int i = 0; i < arr.length - 1; i++) {
			// 앞뒤로 비교하면서 정렬 수행
			for (int j = 0; j < arr.length - i - 1; j++) {
				// 오름차순이기 때문에 앞뒤로 값을 비교했을 때 큰 값을 뒤로 보낸다.
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			// 정렬을 한 번씩 수행했을 때 배열의 내용을 출력해서 정렬 과정도 체크
			printArray(i + 1, arr);
		}
	}

	static void select(int[] arr) {
		// 선택 정렬
		// 정렬을 (배열 길이 - 1)번 수행
		// 기준 인덱스에는 제일 작은 값이 있는 인덱스 번호를 저장
		// 제일 작은 값이 있는 인덱스와 기준 인덱스 값을 교환
		// 배열 내용을 출력

		// 기준 인덱스 0 ~ (배열 길이 - 1)
		for (int i = 0; i < arr.length - 1; i++) {
			
			// 제일 작은 값이 있는 인덱스를 저장할 변수 선언, 초기화는 기준 인덱스
			
			int idx = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				
				// 제일 작은 값이 있는 인덱스 번호를 저장
				if (arr[idx] > arr[j]) {
					idx = j;
				}
			}
			
			// 제일 작은 값이 있는 인덱스와 기준 인덱스 값과 교환
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;

			// 배열 내용을 출력
			printArray(i + 1, arr);
		}
	}
	
	
	static void insert() {
		//삽입 정렬
		//데이터가 들어올 때마다 역으로 버블 정렬
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			//1. 배열에 숫자 입력
			System.out.print("배열에 들어갈 숫자 입력 >> ");
			arr[i] = sc.nextInt();
			//2. 정렬
			for (int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j -1];
					arr[j -1] = temp;
				}
			}
			//3. 배열 출력
			printArray(i + 1, arr);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 8, 4, 6, 9, 7, 1 };
		bubble(arr1);
		System.out.println("============================");
		int[] arr2 = { 8, 4, 6, 9, 7, 1 };
		select(arr2);
		System.out.println("============================");
		insert();
	}

}