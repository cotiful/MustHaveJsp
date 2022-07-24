package my_mustHave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnect {
 public Connection getConnection() {
	 Connection con = null;
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@musthave?TNS_ADMIN=/Users/Wallet_DB20220722084609";
		String user = "ADMIN";
		String password = "2013^^shyundkdl";
		con = DriverManager.getConnection(url,user,password);
		System.out.println("db.연결성공(기본생성)");
	} catch (Exception e) {
		e.printStackTrace();
	}
	 return con;
 }
 
}

