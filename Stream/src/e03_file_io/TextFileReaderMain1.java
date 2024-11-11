package e03_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderMain1 {

	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			// 1. 노드 스트림 연결
			fr = new FileReader("c:\\test\\notice.txt");
			// 2. 프로세스 스트림 연결(부가 기능)
			br = new BufferedReader(fr);

			// 3. 데이터를 읽어옴
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}