
public class E14_Quest {

	public static void main(String[] args) {
		/*
		 * 삼각함수 표 출력 각도 사인 코사인 탄젠트 1 0.000 0.000 0.000
		 * 
		 */
		System.out.print("각도\t사인\t\t코사인\t\t탄젠트\n\n");
		for (int i = 1; i <= 90; i++) {
			double radian = Math.toRadians(i);
			if(i < 90)
				System.out.printf("%4d %10.4f %10.4f %10.4f\n", i, Math.sin(radian), Math.cos(radian), Math.tan(radian));
			else
				System.out.printf("%4d %10.4f %10.4f\t∞\n", i, Math.sin(radian), Math.cos(radian));
		}
	}
}