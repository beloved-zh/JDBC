package com.hopu.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static Connection conn;
	private static PreparedStatement pst;

	static{
		Properties p = new Properties();
		InputStream input = DBUtil.class.getResourceAsStream("jdbc.properties");
		try {
			p.load(input);
			driver = p.getProperty("jdbc.driver");
			url = p.getProperty("jdbc.url");
			username = p.getProperty("jdbc.username");
			password = p.getProperty("jdbc.password");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				input.close();
				p.clear();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static PreparedStatement getPst(String sql) {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			pst = conn.prepareStatement(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pst;
	}
	
	public static void close(ResultSet rs) {
		try {
			if (rs!=null) rs.close();
			if (pst!=null) pst.close();
			if (conn!=null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
