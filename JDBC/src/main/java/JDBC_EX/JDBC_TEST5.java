package JDBC_EX;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;

public class JDBC_TEST5 {
    public static void main(String[] args) {

        try {
            OracleDataSource ods = new OracleDataSource();
//            ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
//            ods.setUser("C##SCOTT");
//            ods.setPassword("1234");
            ods.setURL("jdbc:oracle:thin:C##SCOTT/1234@localhost:1521:xe");
            try(Connection conn = ods.getConnection()) {
                String sql = "SELECT * FROM PERSON";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(
                            rs.getString("PID") + " / "
                                    + rs.getString(2));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}