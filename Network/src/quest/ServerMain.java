package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
//		포트번호 3333 서버 오픈
//
//		클라이언트 접속을 받은 후 클라이언트로부터 숫자를 하나 받음
//
//		받은 숫자의 제곱을 클라이언트에게 전송
//
//		주고 받는 데이터는 문자열로 보내고 받음
		
		
		System.out.println("서버 프로그램을 실행합니다....");
		try (ServerSocket server = new ServerSocket(3333);
				Socket client = server.accept();
				PrintWriter pw = new PrintWriter(client.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				) {
			
			System.out.println("사용자로부터 데이터를 기다리는 중..");
			
			// 사용자로부터 데이터 받음
			String data = br.readLine();
			// 받은 데이터를 숫자로 변경
			int num = Integer.parseInt(data);
			num *= num;
			// 사용자에게 데이터 전송
			pw.println(String.valueOf(num));
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}