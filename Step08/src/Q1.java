import java.util.Arrays;
import java.util.Random;

//로또 번호 5세트 출력, Random 클래스 이용

public class Q1 {

	public static void main(String[] args) {
		Random r = new Random();
		for (int k = 0; k < 5; k++) {
			int[] arr = new int[7];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}

			System.out.println(Arrays.toString(arr));
		}
	}

}