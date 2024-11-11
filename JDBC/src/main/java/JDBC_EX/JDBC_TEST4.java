package JDBC_EX;

import java.sql.*;
import java.util.Scanner;

public class JDBC_TEST4 {
    public static void main(String[] args) {
        // 학생 이름 일부를 입력 받아 해당 학생 정보를 조회해서 출력
        try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe","C##SCOTT","1234")) {

            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();

            String sql = "SELECT * FROM STUDENT WHERE STD_NAME LIKE '%' || ? || '%'";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getString("std_no") + "/"
                        + rs.getString("STD_NAME") + "/"
                                + rs.getString("major_no") + "/"
                                + rs.getString("STD_SCORE")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
