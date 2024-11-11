
public class E04_Quest {

	public static void main(String[] args) {
		//배열 생성
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//배열에 저장된 값들 중 홀수의 개수 출력
		//1. 홀수 개수 저장할 변수
		//2. 배열 첫 번째 요소부터 마지막까지 접근하면 해당 값이 홀수인지 확인
		//3. 홀수 개수 출력
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] % 2 == 1 )
				count++;
		}
		System.out.println(count);
	}

}
