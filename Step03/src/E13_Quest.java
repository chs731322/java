import java.util.Scanner;

public class E13_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도 입력 >> ");
		
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "는 윤년입니다.");
		}else {
			System.out.println(year + "는 윤년이 아닙니다.");
		}
	}

}