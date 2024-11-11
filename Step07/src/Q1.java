
public class Q1 {
//	> Q1. 2차원 배열 5행 5열짜리 배열을 생성한 후 달팽이 모양으로 내용을 채움
//	> 
//	> 
//	> 1   2   3   4   5
//	> 16  17  18  19   6
//	> 15  24  25  20   7
//	> 14  23  22  21   8
//	> 13  12  11  10   9

//	[0/0,1,2,3,4]	>증가
//	[1,2,3,4/4]		>증가
//	[4/3,2,1,0] > 감소
//	[3,2,1/0]	> 감소
//	[1/1,2,3]	> 증가
//	[2,3/3]
//	[3/2,1]
//	[2/1]
//	[2/2]

//	1. 행이 0일 때, 열 0,1,2,3,4
//	2. 전환해서 열이 4일 때, 행이 1,2,3,4
//	..
//	행 - 1개, 열 5개
//	행 4개, 열 1개
//	행 1개, 열 4개
//	행 3개, 열 1개
//	행 1개, 열 3개
	
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		int row = 0; // 행
		int col = -1; // 열
		int cnt = arr.length; // 채울 숫자의 개수 -> 5개, 4개, 4개, 3개, ...
		int sw = 1; // 증감
		int num = 1; // 값

		while (true) {

			for (int i = 0; i < cnt; i++) { // 행고정 열변화
				col += sw;
				arr[row][col] = num++;
			}
			cnt--;
			if (cnt == 0)
				break;

			for (int j = 0; j < cnt; j++) { // 열고정 행변화
				row += sw;
				arr[row][col] = num++;
			}
			sw *= -1;

		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int v : arr[i]) {
				System.out.printf("%2d ", v);
			}
			System.out.println();
		}
	}
}
