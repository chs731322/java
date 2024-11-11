import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
//	Client
//	1. 서버 접속
//	2. 서버로 메시지 보낸 후 다시 메시지를 받음, exit 전송 후 접속 종료
//	3. 2번 과정을 반복
	public static void main(String[] args) {
		try (Socket server = new Socket("127.0.0.1", 1111);
				Scanner sc = new Scanner(System.in);
				PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));) {

			String msg = null;
            while (true) {
                System.out.print("문자열을 입력하세요 >> ");
                msg = sc.nextLine();
                pw.println(msg);

                if (msg.equals("exit")) {
                    System.out.println("프로그램 종료..");
                    break;
                }

                String remsg = br.readLine();
                System.out.println("서버에서 보낸 결과: " + remsg);
            }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}