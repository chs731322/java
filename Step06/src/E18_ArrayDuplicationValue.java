import java.util.Arrays;

public class E18_ArrayDuplicationValue {

	public static void main(String[] args) {
		int[] arr = new int[7];

		// 랜덤으로 배열에 숫자를 저장, 저장할 범위 : 1~10
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--; // 인덱스를 줄여서 다시 루프가 돌 때 그 자리에 새 값이 들어온다.
						// arr[4]가 앞에 중복된 값이 있을 때 다음 루프가 원래 arr[5]값을 정할 차례지만 i를 하나 줄여서 다시 arr[4]값을 넣게 됨
					break;
				}
			}
		}

		// 출력
		System.out.println(Arrays.toString(arr));
	}
}