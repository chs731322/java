import java.util.Scanner;

public class E05_Quest {

	public static void main(String[] args) {
		/*
		 * 정수형 배열 길이가 7인 배열을 생성한 뒤
		 * 배열의 숫자를 전부 사용자로부터 입력 받아서 저장한 후
		 * 배열에 있는 모든 값 출력
		 * 
		 * 0번째 숫자 입력 : 3
		 * 1번째 숫자 입력 : 4
		 * ..
		 * 6번째 숫자 입력 : 11
		 * 
		 * 3 4 .. 11
		 * 
		 * 단, Arrays.toString은 사용하지 않는다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 숫자 입력 >> ",i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
	}

}
