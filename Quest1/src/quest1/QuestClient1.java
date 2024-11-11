package quest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class QuestClient1 {

    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int SERVER_PORT = 9999;

        try (
                Socket server = new Socket(SERVER_IP, SERVER_PORT);
                Scanner sc = new Scanner(System.in);
                PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
                BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
        ) {
            System.out.print("숫자를 입력하세요: ");
            int facNumber = sc.nextInt();

            pw.println(String.valueOf(facNumber));

            String factorialResult = br.readLine();
            System.out.println("서버로부터 받은 팩토리얼 결과: " + factorialResult);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}