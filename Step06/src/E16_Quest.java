
public class E16_Quest {

	public static void main(String[] args) {
		//주사위를 두 번 굴려서 더블이 나올 때까지 굴리기
		// 1 1, 2 2, 3 3, 4 4, 5 5, 6 6
		//주사위를 굴릴 때마다 굴린 결과값도 출력
		// 4 3
		// 2 6
		// 3 3
		int dice1 = 0;
		int dice2 = 0;
		
		do {
			dice1 = (int)(Math.random() * 6)+ 1;
			dice2 = (int)(Math.random() * 6)+ 1;

			System.out.printf("%d %d \n",dice1, dice2);
		} while(dice1 != dice2);
		
//		dice1 = 1;
//		dice2 = 2;
//		while(dice1 != dice2) {
//			dice1 = (int)(Math.random() * 6)+ 1;
//			dice2 = (int)(Math.random() * 6)+ 1;
//
//			System.out.printf("%d %d \n",dice1, dice2);
//		}
//		
//		dice1 = 1;
//		dice2 = 2;
//		while(true) {
//			dice1 = (int)(Math.random() * 6)+ 1;
//			dice2 = (int)(Math.random() * 6)+ 1;
//
//			System.out.printf("%d %d \n",dice1, dice2);
//			if(dice1 == dice2) break;
//		}
	}

}
