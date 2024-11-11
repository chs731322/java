package e03_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderMain2 {

	public static void main(String[] args) {
		// try-with-resources
		try (FileReader fr = new FileReader("c:\\test\\notice.txt");
				BufferedReader br = new BufferedReader(fr);) {
			
			String str = null;
			while((str = br.readLine()) != null)
				System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
