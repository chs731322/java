import java.util.Arrays;

public class E20_ArrayCopy {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 1. 공간을 늘린 임시 배열 작성
		int[] temp = new int[arr.length + 5];

		// 2.기존 배열의 값을 새 배열로 각각 복사
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		// 3. 임시 배열을 arr로 연결
		arr = temp;

		// 4. 결과 출력
		System.out.println(Arrays.toString(arr));

		// ===============================================

		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] arr3 = new int[arr.length + 5];

		System.arraycopy(arr2, 0, arr3, 0, arr2.length);
		System.out.println(Arrays.toString(arr3));
		
	}
}
