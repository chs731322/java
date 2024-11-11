import java.util.Arrays;

public class Q1_2 {

	public static void main(String[] args) {
//		문자형 배열에 저장된 내용을 전부 거꾸로 뒤집어서 저장한 후에 배열을 문자열로 만든 다음에 결과를 출력
//
//		0 1 2 3 4 5 6 7 8 9 10
//		H e l l o  W o r l d
//
//		d l r o W  o l l e H
		
		String arr[] = {"H","e","l","l","o"," ","W","o","r","l","d"};
		String temp[] = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			temp[i] = arr[arr.length-i-1];
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));

	}

}
