import java.util.Scanner;

public class E06_Quest {

	public static void main(String[] args) {
		/*
		 * 	정수형 배열 길이가 10인 배열을 생성한 후에
		 * 	정수를 입력 받아서 배열의 각 요소에 전부 저장한 후에
		 * 	배열에 저장된 값의 총합을 출력
		 * 	배열에 저장된 값들 중 최대값을 출력
		 * 
		 */
		//1. 배열 선언, 총합 저장할 변수
		//2. 배열에 숫자 입력
		//3. 총합
		//4. 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int sum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 숫자 입력 >> ",i+1);
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("\n배열의 총합 >> " + sum);
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("배열의 최대값 : " + max);
		System.out.println("배열의 최솟값 : " + min);
		
	}

}
