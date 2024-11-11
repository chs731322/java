
public class E09_Quest {

	public static void main(String[] args) {
		/*
		 * arr의 내용을 전부 대문자로 변환
		 * 
		 * arr을 String으로 생성 후 출력
		 * 
		 */
		
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
			if(arr[i] >= 'a' && arr[i] <= 'z') 
				arr[i] -= 32;
		
		str = new String(arr);
		System.out.println(str);
		System.out.println(str.toUpperCase());
	}

}
