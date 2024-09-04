package advancedJava2;

import java.sql.*;
import java.util.Scanner;

public class DBDemo5 {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    getSpecificPersonInfo(conn);
  }

  public static void getSpecificPersonInfo(Connection conn) throws SQLException {
    Scanner in = new Scanner(System.in);
    System.out.println("이름을 입력하세요.");
    String ns = in.next();
    String sql = "select * from person where name = ? ";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1,ns);
    ResultSet rs = ps.executeQuery();
    if (rs == null){
      System.out.println("조건에 맞는 데이터가 없습니다.");
    } else {
      while (rs.next()){
        System.out.println(rs.getString(1)+","+rs.getString(2)+"," + rs.getString(3));
      }
    }
    while (rs.next()) {
      System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
    }
    rs.close();
  }

  public static Connection makeConnection() {
    String url = "jdbc:mysql://localhost/javaex?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결중...");
      conn = DriverManager.getConnection(url, "root", "1234");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버 검색 오류");
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
    }
    return conn;
  }
}