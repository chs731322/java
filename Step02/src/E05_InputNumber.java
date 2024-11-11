import java.util.Scanner;

public class E05_InputNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		System.out.print("숫자를 입력하세요 >> ");
		
		n1 = sc.nextInt(); // 실제 숫자를 입력 받고 난 뒤에 n1에 저장
		System.out.println("입력 받은 숫자 >> " + n1);
		
		System.out.print("숫자를 입력하세요 >> ");
		int n2 = sc.nextInt();
		System.out.println("입력 받은 숫자 >> " + n2);
		
		//실수 하나 입력 받아서 출력
		System.out.print("숫자를 입력하세요 >> ");
		double n3 = sc.nextDouble();
		System.out.println("입력 받은 숫자 >> " + n3);
		
		System.out.print("숫자를 입력하세요 >> ");
		float n4 = sc.nextFloat(); 
		System.out.println("입력 받은 숫자 >> " + n4);
		
	}

}