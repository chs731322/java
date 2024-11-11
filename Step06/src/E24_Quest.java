import java.util.Arrays;
import java.util.Scanner;

public class E24_Quest {
	
//	정수형 배열 길이가 10인 배열을 생성
//	입력한 숫자가 짝수면 맨 뒤에서 부터 채움
//	입력한 숫자가 홀수면 맨 앞에서 부터 채움
//	입력이 끝나면 전체 내용 출력
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int start = 0, end = arr.length - 1;
		
		while(start <= end) {
			System.out.print("숫자 입력 >> ");
			int n = sc.nextInt();
			//홀짝 판단해서 저장
			if(n % 2== 1)
				arr[start++] = n;
			else
				arr[end--] = n;
			System.out.println(Arrays.toString(arr));
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("숫자 입력 >> ");
//			arr[i] = sc.nextInt();
		//홀짝 판단해서 저장
//			if(arr[i] % 2 == 1) {
//				start++;
//			} else {
//				arr[end] = arr[i];
//				end--;
//			}
//			if(start <= end)
//				break;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//숫자 입력
		
	}

}
