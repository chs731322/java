package e01_string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String str1 = "Hello World";
		// 저장하고 있는 문자열을 바이트형 배열로 변환
		byte[] arr = str1.getBytes();
		// 배열에 저장된 내용을 출력
		System.out.println(Arrays.toString(arr));

		// 바이트형 배열을 문자열로 변환
		String str2 = new String(arr);
		// 배열에 저장된 내용을 출력
		System.out.println(str2); // Hello World

		// 해당 인덱스 번호에 위치한 문자 하나 리턴
		System.out.println(str1.charAt(4)); // o

//		String str3 = "가나다라"; //한글은 2바이트기 때문에 음수
//		//바이트형 배열로 변환 후 출력
//		byte[] arr2 = str3.getBytes();
//		System.out.println(Arrays.toString(arr2));

		String str3 = "Hello World Hello Java World";
		// 문자열 왼쪽부터 검색, 검색 결과는 인덱스 번호
		System.out.println(str3.indexOf("World")); // 6
		// 문자열 왼쪽부터 검색, 7번째 인덱스부터 검색
		System.out.println(str3.indexOf("World", 7)); // 23
		// 문자열 왼쪽부터 검색, 24번째 인덱스부터 검색
		// 24부터 검색했는데 찾는 결과가 없다면 -1
		System.out.println(str3.indexOf("World", 24)); // -1
		// 오른쪽 끝에서부터 검색
		System.out.println(str3.lastIndexOf("World")); // 23
		System.out.println(str3.lastIndexOf("World", 22)); // 6

		// 알파벳을 전부 소문자로 변환
		System.out.println(str3.toLowerCase());
		// 알파벳을 전부 대문자로 변환
		System.out.println(str3.toUpperCase());

		// 글자 개수
		System.out.println(str3.length());

		// 문자열 부분 추출 - 10번 인덱스부터 마지막 인덱스까지 문자열을 잘라내서 리턴
		System.out.println(str3.substring(10));
		// 문자열 부분 추출 - 10번 인덱스부터 15번 인덱스 전 까지 문자열을 잘라내서 리턴
		System.out.println(str3.substring(10, 15));

		// 앞의 문자열을 뒤의 문자열로 바꿈
		System.out.println(str3.replace("World", "Hell"));

		String str4 = "          Hello World     ";
		// 문자열 개수랑 문자열 출력
		System.out.println(str4.length());
		System.out.println(str4);
		// 문자열 양쪽에 있는 공백 제거
		System.out.println(str4.trim());

		// 문자열을 구분자를 기준으로 잘라서 배열로 만들어줌
		String str5 = "java,html,css,javascript,jsp,spring";
		String[] result = str5.split(",");
		// 문자열로 된 배열을 하나의 문자열로 만들어줌
		System.out.println(Arrays.toString(result));
		// 문자열과 문자열 사이에 구분자 넣어줌
		// 구분 문자를 넣어서 하나로 합침
		String str6 = String.join("/", result);
		System.out.println(str6);

		// 문자열 포맷 - %s, %d, %f, %x, %X, %b, %c, %f, %g
		// %10d > 10출력공간을 확보해서 출력(양수면 오른쪽 정렬, 음수면 왼쪽 정렬)
		// %.2f > 소수점 둘쨰자리까지 표시, 셋째자리에서 반올림
		System.out.println(String.format("이름 : %s, 나이 : %d", "김철수", 20));
		System.out.println(String.format("%d %x %o", 10, 10, 10)); // 10진수 16진수 8진수
		System.out.println(String.format("%05d", 10)); 
		System.out.println(String.format("%b %c", true, '가')); // boolean, char
		System.out.println(String.format("%f %g", 3.1415, 3.1415)); 
	}

}