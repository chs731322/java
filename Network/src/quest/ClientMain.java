package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		try (Socket server = new Socket("127.0.0.1", 3333);
				Scanner sc = new Scanner(System.in);
				PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				) {
			
			// 서버가 클라이언트 데이터를 받으려고 대기함, 먼저 서버로 데이터 전송
			
			System.out.println("숫자를 입력하세요 >>");
			int num = sc.nextInt();
			pw.println(String.valueOf(num));
			
			// 서버가 보낸 데이터를 받아서 출력
			String msg = br.readLine();
			System.out.println("서버에서 보낸 결과 : " + msg);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
