import java.util.Arrays;

public class E23_Quest {
//	길이가 20인 정수형 배열을 생성 후 값을 1~20까지 저장
//	배열에 있는 내용을 자유롭게 섞은 후에 배열 내용 출력
	public static void main(String[] args) {
		int[] arr = new int[20];
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
		}
		for(int i = 0; i < arr.length; i++) {
			int idx = (int) (Math.random() * arr.length);
			
			// i와 idx가 동일할 경우에는 값을 교환할 필요가 없으므로
		    // 반복문의 현재 반복을 건너뛰고 다시 시도
			if(i == idx) {
				i--;// i를 다시 실행하기 위해 i를 감소시킴
				continue;
			}
			
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;  // arr[idx]에 temp(즉, arr[i]의 원래 값)을 대입
		}
		System.out.println(Arrays.toString(arr));
	}

}
