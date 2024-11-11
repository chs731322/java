package config;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.SQLException;

// 싱글톤 패턴 적용
public class DBManager {
    // private static으로 인스턴스 생성
    private static DBManager instance = new DBManager();
    private OracleDataSource ods;
    // private 생성자
    private DBManager() {
        try {
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:C##SCOTT/1234@localhost:1521:xe");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() throws SQLException {
        return ods.getConnection();
    }

//    // close 메서드
//    public void close(Connection conn, Statement stmt, ResultSet rs) {
//
//    }

    // public static으로 외부에서 접근 가능한 get 메서드 생성
    public static DBManager getInstance() {
        if(instance == null)
            instance = new DBManager();
        return instance;
    }

}