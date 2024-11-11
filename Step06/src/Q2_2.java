import java.util.Arrays;

public class Q2_2 {

	public static void main(String[] args) {
//		길이가 20인 정수형 배열을 생성 후 값을 1~20까지 저장
//		배열에 있는 내용을 자유롭게 섞은 후에 배열 내용 출력
		
		int arr[] = new int[20];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20 + 1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
