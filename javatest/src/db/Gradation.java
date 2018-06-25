package db;

import java.sql.*;

public class Gradation {
	private static final Conn c = new Conn();
	private static final Connection con = c.getConnection();
	private static Statement sql;
	private static ResultSet res;

	private void seletc() {
		System.out.println("seletc");
		try {
			sql = con.createStatement();
			res = sql.executeQuery("SELECT * from  Student");
			while (res.next()) {
				int id = res.getInt("ID");
				String lastName = res.getString("LastName");
				String firstMidName = res.getString("FirstMidName");
				System.out.println(String.format("Id:%s,姓氏:%s,FirstMidName:%s", id, lastName, firstMidName));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void seletcLike(String like) {
		System.out.println("seletcLike");
		try {
			sql = con.createStatement();
			res = sql.executeQuery("SELECT * from  Student where LastName like '%" + like + "%'");
			while (res.next()) {
				int id = res.getInt("ID");
				String lastName = res.getString("LastName");
				String firstMidName = res.getString("FirstMidName");
				System.out.println(String.format("Id:%s,姓氏:%s,FirstMidName:%s", id, lastName, firstMidName));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Gradation g = new Gradation();
		g.seletc();
		g.seletcLike("1");
	}

}
