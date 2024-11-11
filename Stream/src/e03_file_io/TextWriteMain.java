package e03_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextWriteMain {
//	public static void close(PrintWriter pw, FileWriter fw) {
//		try {
//			if(fw != null) fw.close();
//			if(pw != null) pw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
		// 1. 노드 스트림, 프로세스 스트림 생성 및 초기화
		// true : 추가 모드 (기존 파일 삭제 X 이어서 쓰기)
		// false : 새 파일 (기존 파일 삭제함)
		try (FileWriter fw = new FileWriter("c:\\test\\write.txt", true); 
				PrintWriter pw = new PrintWriter(fw);) {
			
			// 2. 텍스트 출력
			pw.println("안녕하세용~!");
			pw.println("12345678910");
			pw.println("Hello World");
			pw.println("나는 조해솔");
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
