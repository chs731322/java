import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
//		최초의 정수형 배열은 길이가 5인 배열 생성
//		배열에 숫자를 순서대로 입력해 나가면서 -1을 입력할 때까지 계속해서 배열에 숫자 입력
//		단, 배열에 내용이 전부 채워지면 그 때마다 배열의 길이를 3씩 늘림
//		배열에 숫자 입력이 끝나면 입력된 내용을 전부 출력
//		배열에 입력된 숫자들의 평균을 출력
//		단, 마지막에 입력된 -1은 제외하고 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i = 0, sum = 0;

		while (true) {
			System.out.print("숫자 입력 >> ");
			arr[i] = sc.nextInt();

			if (arr[i] == -1)
				break;
			i++;

			if (i == arr.length) {
				// 1. 임시 배열
				int[] temp = new int[arr.length + 3];
				// 2. 배열 내용 복사
				System.arraycopy(arr, 0, temp, 0, arr.length);
				// 3. 배열 연결
				arr = temp;
			}
		}

		for (int j = 0; j < i; j++) { //arr[i]에 -1값이 들어있기 때문에 i보다 j가 작아야함.
			sum += arr[j];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("배열의 평균 > " + (double) sum / i);

	}

}
