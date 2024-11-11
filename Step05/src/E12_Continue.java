
public class E12_Continue {

	public static void main(String[] args) {
		//1~10까지 출력
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		//============while문
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
