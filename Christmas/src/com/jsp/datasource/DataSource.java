
package com.jsp.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataSource {

	private static DataSource instance=new DataSource();
	private DataSource() {}
	public static DataSource getInstatnce() {
		return instance;
	}

	public Connection getConnection() {


		   
	    Connection conn = null;
        try {
        	 String user = "CE1261043"; 
     	    String pw = "wlfkfak33";
     	    String url = "jdbc:oracle:thin:@203.250.143.243:1521:xe";
            
            Class.forName("oracle.jdbc.driver.OracleDriver");        
            conn = DriverManager.getConnection(url, user, pw);
            
            System.out.println("Database?�� ?��결되?��?��?��?��.\n");
            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("DB ?��?��?���? 로딩 ?��?�� :"+cnfe.toString());
        } catch (SQLException sqle) {
            System.out.println("DB ?��?��?��?�� : "+sqle.toString());
        } catch (Exception e) {
            System.out.println("Unkonwn error");
            e.printStackTrace();
        }
        return conn;    


	
	}
	
}
