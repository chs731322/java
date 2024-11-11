import java.util.Arrays;

public class Quest2 {

    public static void main(String[] args) {

//정수형 배열 길이가 10인 배열을 생성하고 숫자 1~50중 랜덤하게 채움

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 50) + 1;

        }
        System.out.println(Arrays.toString(arr));

//홀수의 개수 출력

        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddCount++;
            }

        }
        System.out.println("홀수의 개수: " + oddCount);
    }

}