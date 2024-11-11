import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
//		정수형 배열 길이가 10인 배열을 생성
//		입력한 숫자가 짝수면 맨 뒤에서 부터 채움
//		입력한 숫자가 홀수면 맨 앞에서 부터 채움
//		입력이 끝나면 전체 내용 출력
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 >> ");
			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 0) {
				arr[arr.length-i-1] = arr[i];
			}
			
		}
		System.out.println(Arrays.toString(arr));
	
	}

}
