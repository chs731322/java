import java.util.Scanner;

public class E13_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 숫자 입력 >> ", i + 1);
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = (Math.max(max, arr[i]));
			min = (Math.min(min, arr[i]));
		}
		
		System.out.println("배열의 총합 : " + sum);
		System.out.println("배열의 최대값 : " + max);
		System.out.println("배열의 최솟값 : " + min);
	}

}
