import java.util.Scanner;

public class E10_StringEquals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		String str3 = new String("안녕하세요");
		
		System.out.print("문자열 입력 >> ");
		String str4 = sc.next();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3); //메모리가 달라서 false
		System.out.println(str3 == str4); //메모리가 달라서 false
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		System.out.println(str1.equals(str3)); //문자열을 비교하려면 equals 사용
		System.out.println(str1.equals(str4));
	}

}