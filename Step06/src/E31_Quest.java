
public class E31_Quest {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int row = 0, col = -1, sw = 1, n = 1, k = 5;
		while (true) {
			// 가로 방향 채우기
			for (int i = 0; i < k; i++) {
				col += sw;
				arr[row][col] = n++;
			}

			// 채우는 개수 감소
			k--;
			
			if(k == 0)
				break;
			
			// 세로 방향 채우기
			for (int i = 0; i < k; i++) {
				row += sw;
				arr[row][col] = n++;
			}
			sw = -sw;
			
			
		}
		
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}