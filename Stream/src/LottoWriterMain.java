import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LottoWriterMain {

	public static void main(String[] args) {
		Random r = new Random();
		// 1. 노드 스트림, 프로세스 스트림 생성 및 초기화
		// true : 추가 모드 (기존 파일 삭제 X 이어서 쓰기)
		// false : 새 파일 (기존 파일 삭제함)
		try (FileWriter fw = new FileWriter("c:\\test\\LottoWriter.txt"); PrintWriter pw = new PrintWriter(fw);) {

			// 2. 텍스트 출력
			pw.println("\tLOTTO");
			pw.println("----------------------------");
			for (int i = 0; i < 5; i++) { // 5세트 반복
                HashSet<Integer> set = new HashSet<>();
                while (set.size() < 7) {
                    set.add(r.nextInt(45) + 1);
                }

                pw.println(set);
            }

			pw.println("----------------------------");
            pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
