package db;

import java.sql.*;

public class DBClass {
	public static void conTest() {
        Connection conn = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/thedb?serverTimezone=Asia/Seoul";

            conn = DriverManager.getConnection(url, "root", "1234");
            System.out.println("연결 성공");

        }
        catch(ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch(SQLException e){
            System.out.println("에러: " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
	}
	
	public static void numinsert(int num1, int num2) {
		Connection conn = null;
		PreparedStatement pstmt = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/thedb?serverTimezone=Asia/Seoul";

            conn = DriverManager.getConnection(url, "root", "1234");
            System.out.println("연결 성공");
            
            String sql = "INSERT INTO num_tb VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setInt(1, num1);
            pstmt.setInt(2, num2);
            
            int count = pstmt.executeUpdate();
            if( count == 0 ){
                System.out.println("데이터 입력 실패");
            }
            else{
                System.out.println("데이터 입력 성공");
            }

        }
        catch(ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch(SQLException e){
            System.out.println("에러: " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
                if( pstmt != null && !pstmt.isClosed()){
                	pstmt.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
	}
	
	public static void userinsert(String id, String name, int grade) {
		Connection conn = null;
		PreparedStatement pstmt = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost/thedb?serverTimezone=Asia/Seoul";

            conn = DriverManager.getConnection(url, "root", "1234");
            System.out.println("연결 성공");
            
            String sql = "INSERT INTO user_tb VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, grade);
            
            int count = pstmt.executeUpdate();
            if( count == 0 ){
                System.out.println("데이터 입력 실패");
            }
            else{
                System.out.println("데이터 입력 성공");
            }

        }
        catch(ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch(SQLException e){
            System.out.println("에러: " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
                if( pstmt != null && !pstmt.isClosed()){
                	pstmt.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
	}
}
