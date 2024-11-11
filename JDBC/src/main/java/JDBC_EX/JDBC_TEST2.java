package JDBC_EX;

import java.sql.*;

public class JDBC_TEST2 {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe","C##SCOTT","1234")) {

//            conn.setAutoCommit(false); // 자동 저장을 끄고 수동 저장으로 변경
            String sql = "insert into person values('0012', '곤프릭스', 12)";
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            System.out.println("몇 건 적용 : " + result);
//            conn.commit();  // 수동 저장
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}