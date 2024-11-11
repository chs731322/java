import java.util.Arrays;
import java.util.Scanner;

public class E25_Quest {

	public static void main(String[] args) {
		// 정수형 배열 생성, 길이 10
		int[] arr = new int[10];
		int idx = 0, count = 0;

		// Scanner 생성
		Scanner sc = new Scanner(System.in);

		// 반복문 - 무한루프
		while (true) {
			System.out.println();
			System.out.println("1. 숫자 추가");
			System.out.println("2. 숫자 삭제");
			System.out.println("3. 전체 숫자 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("\n번호를 입력하세요 >> ");
			int no = sc.nextInt();
			
			if (no == 0) {
				System.out.println("========== 프로그램 종료 ==========");
				break;
			} else if (no == 1) {
				// 숫자 입력 받아 배열에 추가
				// 단, 배열에 저장할 공간이 없으면 배열 길이 5씩 늘린 후 저장
				
				if (idx == arr.length) {
					// 1. 임시 배열
					int[] temp = new int[arr.length + 5];
					// 2. 배열 내용 복사
					System.arraycopy(arr, 0, temp, 0, arr.length);
					// (원본 배열, 원본 배열에서 복사 시작할 인덱스, 새 배열, 새 배열에서 복사 시작할 인덱스, 복사할 길이)
					// 3. 배열 연결
					arr = temp;
				}
				
				System.out.print("추가할 숫자 입력 >> ");
				arr[idx++] = sc.nextInt();

			} else if (no == 2) {
				//삭제할 데이터 입력
				System.out.print("삭제할 숫자 입력 >> ");
				int n = sc.nextInt();
				
				//삭제할 데이터 찾기
				boolean flag = false;
				for(int i = 0; i < idx; i++) {
					//1.삭제할 데이터가 있는 경우 데이터를 한 칸씩 앞으로 당김
					if(arr[i] == n) {
						flag = true;
						for(int j = i; j < idx - 1; j++) {
							arr[j] = arr[j+1];
						}
						idx--;
						
						break;
					}
					
				}
				if(flag)
					System.out.println("------------- 데이터 삭제 완료 -------------");
				else
					System.out.println("삭제할 데이터가 없습니다.");
				
			} else if (no == 3) {
				System.out.print("\n입력받은 숫자 전체 출력 : ");
				for(int i = 0; i < idx; i++) {
					
					System.out.print(arr[i] + " ");
					
				}
				System.out.println();
			}
		}
	}

}
