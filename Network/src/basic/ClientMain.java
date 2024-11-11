package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) {
		// 1. 서버 접속
		try (Socket server = new Socket("127.0.0.1", 1234);) {
			
			// 2. 스트림 초기화
			PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			
			// 3. 입출력 처리
			// 서버가 클라이언트 데이터를 받으려고 대기함, 먼저 서버로 데이터 전송
			pw.println("클라이언트가 보낸 메세지");
			// 서버가 보낸 데이터를 받아서 출력
			System.out.println(br.readLine());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
