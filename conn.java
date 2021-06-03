package ems;

import java.sql.*;

public class conn {

	public Connection c;
	public Statement s;
	
	public conn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///ems","root","");
			s = c.createStatement();
		} catch(Exception e) {
			e.printStackTrace();
		}
	

	}
	
public static void main(String args[]) {
	conn c = new conn();
}

}
