package JDBC_EX;

import java.sql.*;
import java.util.Scanner;

public class JDBC_TEST3 {
    public static void main(String[] args) {
        // PERSON 데이터 한 건을 사용자로부터 입력 받아서 데이터 베이스 PERSON 테이블에 추가
        // PID, PNAME, AGE를 입력 받아서 테이블 추가

        try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe","C##SCOTT","1234")) {

            Scanner sc = new Scanner(System.in);
            System.out.print("번호를 입력하세요 : ");
            String pid = sc.next();
            System.out.print("이름을 입력하세요 : ");
            String pname = sc.next();
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();

//            String sql = "insert into person values('"+pid+"', '"+pname+"', '"+age+"')";
//            String sql = String.format("insert into person values('%s', '%s', %d)", pid, pname, age);
            String sql = "insert into person values(?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, pid);
            pstmt.setString(2, pname);
            pstmt.setInt(3, age);

            int result = pstmt.executeUpdate();
            System.out.println("몇 건 적용 : " + result);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
