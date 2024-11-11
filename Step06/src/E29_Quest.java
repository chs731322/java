
public class E29_Quest {
	/*
	 * 1 2 3 4 5 10 9 8 7 6 ..
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1, sw = 1, col = 0;
//		[0/0,1,2,3,4]
//		[1/4,3,2,1,0]

		for (int i = 0; i < arr.length; i++) {
			// 각 행에 숫자 채우기
			while (col < arr[i].length && col > -1) { // 현재 행의 열(col)이 범위 내일 때까지 실행
				arr[i][col] = num++;
				col += sw; // sw 값에 따라 열의 이동 방향 결정 (sw가 1이면 오른쪽, -1이면 왼쪽으로 이동)
			}
			sw = -sw; // 방향 전환 (다음 행은 반대 방향으로 숫자를 채움)
			col += sw; // 방향 전환 후 다음 행에서 숫자 채우기를 시작할 열로 이동
		}

//		for(int i = 0; i < arr.length; i++) {
//			if(i % 2 == 0) {
//				for(int j = 0; j < arr[i].length; j++) {
//					arr[i][j] = n++;
//				}
//			}else {
//				for(int j = 4; j >= 0; j--) {
//					arr[i][j]=num++;
//				}
//			}
//		}

//		for (int i = 0; i < arr.length; i++) {
//			int j = 0;
//			while(j++ < arr[i].length) {
//				if(i%2==0)
//					arr[i][j-1] = num++;
//				else
//					arr[i][arr[i].length-j]=num++;
//			}
//		
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int v : arr[i]) {
				System.out.printf("%2d ", v);
			}
			System.out.println();
		}
	}

}
