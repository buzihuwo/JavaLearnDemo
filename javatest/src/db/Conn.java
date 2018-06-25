package db;

import java.sql.*;

public class Conn {
	Connection sqlCon;
	
	public Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("数据库驱动加载成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			sqlCon=DriverManager.getConnection("jdbc:sqlserver://biz.db.dev.ad.jinyinmao.com.cn:1433;DatabaseName=JYMOper2", "db-admin-dev", "0SmDXp8i7MRfg29HJk1N");
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sqlCon;
	}

//	public static void main(String[] args) {
//		Conn c=new Conn();
//		c.getConnection();
//
//	}

}
