package cn.nicecoder.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 获取数据库连接
 
 */
public class DBUtil {
	public static final String url = "jdbc:mysql://<<ip>>:<<port>>/<<dbname>>?characterEncoding=utf8&useSSL=true&createDatabaseIfNotExist=true";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "<<username>>";
	public static final String password = "<<password>>";
	
	public Connection conn = null;
	public Connection getConnection() {
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
