
public class PrintMain {

	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(10+5);
		System.out.println(10-5);
		
		System.out.println("Hello");
		System.out.println("Hello" + "World"); //하나의 문자열로 만들어서 출력
		System.out.println("Hello" + 10); 
		
		System.out.println("안녕하세요" + 8282 + 1000 + "갑시다." + 1234 + 1000);
		// 안녕하세요82821000갑시다.12341000
		System.out.println("안녕하세요" + (8282 + 1000) + "갑시다." + (1234 + 1000));
		// 안녕하세요9282갑시다.2234
		System.out.println("-----------------------------------");
		System.out.print("Hello\n");
		System.out.print("World\n");
		System.out.println("-----------------------------------");
		System.out.printf("안녕하세요 %d %d \n", 8282, 1000);
		
	}

}