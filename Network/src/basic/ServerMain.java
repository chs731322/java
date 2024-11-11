package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("서버 프로그램을 실행합니다....");
		// 1. 서버 오픈
		try (ServerSocket server = new ServerSocket(1234);
				// 2. 클라이언트 접속 받음
				//	클라이언트 정보는 Socket으로 생성
				Socket client = server.accept();
				) {
			System.out.println(client.getInetAddress() + " 클라이언트 접속");
			// 3. 입출력 스트림 초기화
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// 4. 데이터 입출력 처리
			// 4-1. 사용자가 보낸 데이터를 받음
			String msg = br.readLine();
			System.out.println(msg);
			// 4-2. 사용자에게 데이터를 보냄
			pw.println("서버에서 보낸 데이터");
			pw.flush();
			// 5. close
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}