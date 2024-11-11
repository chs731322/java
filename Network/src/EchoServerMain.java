import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {
//	Echo Server
//	1. Client 접속 받음
//	2. Client로부터 메시지를 받은 후 다시 클라이언트로 재전송
//	3. Client로부터 받은 메시지가 exit면 서버를 종료
//	4. 2와 3과정을 반복

	public static void main(String[] args) {
		System.out.println("Echo Server 프로그램을 실행합니다....");
		try (ServerSocket server = new ServerSocket(1111);
				Socket client = server.accept();
				PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));) {

			String msg = br.readLine();
			System.out.println("클라이언트로부터 받은 메시지: " + msg);
			if (msg.equals("exit")) {
				System.out.println("연결 종료.");
				pw.println("서버 종료합니다.");
			}
			pw.println(msg);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
