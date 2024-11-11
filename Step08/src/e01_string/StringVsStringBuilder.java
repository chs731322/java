package e01_string;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        // 테스트할 반복 횟수 설정
        int iterations = 100000;

        // String 속도 테스트
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "test";
        }
        long endTime = System.currentTimeMillis();
        long stringTime = endTime - startTime;
        System.out.println("String 걸린 시간: " + stringTime + "ms");

        // StringBuilder 속도 테스트
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("test");
        }
        endTime = System.currentTimeMillis();
        long stringBuilderTime = endTime - startTime;
        System.out.println("StringBuilder 걸린 시간: " + stringBuilderTime + "ms");

        // 결과 비교
        if (stringTime > stringBuilderTime) {
            System.out.println("StringBuilder가 더 빠릅니다.");
        } else {
            System.out.println("String이 더 빠르거나 비슷합니다.");
        }
    }
}