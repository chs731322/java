
public class E08_BookQuest2 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan+=2) {
				System.out.printf("%d * %d = %d\t", dan, i, i * dan);
			}
			System.out.println();
		}
		//=========================continue문 적용
		for(int dan = 2; dan < 10; dan++) {
			if(dan % 2 == 1)
				continue;
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\t", dan, i, i * dan);
			}
			System.out.println();
		}
		
	}

}
