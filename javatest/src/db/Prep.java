package db;

import java.sql.*;

///预处理sql语句
public class Prep {
	private static final Conn c = new Conn();
	private static Connection con = c.getConnection();
	private static PreparedStatement sql;
	private static ResultSet res;

	private void seletcById(int id) {
		try {
			sql = con.prepareStatement("SELECT * from  Student where ID=?");
			sql.setInt(1, id);
			res = sql.executeQuery();
			while (res.next()) {
				int id1 = res.getInt("ID");
				String lastName = res.getString("LastName");
				String firstMidName = res.getString("FirstMidName");
				System.out.println(String.format("Id:%s,姓氏:%s,FirstMidName:%s", id1, lastName, firstMidName));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void insert(String lastName, String firstMidName) {
		try {
			sql = con.prepareStatement("insert into Student values(?,?)");
			sql.setString(1, lastName + (int) (1 + Math.random() * 1000));
			sql.setString(2, firstMidName + (int) (1 + Math.random() * 1000));
			int judge = sql.executeUpdate();
			if (judge > 0)
				System.out.println("添加成功");
			else
				System.out.println("添加失败");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void update(String firstMidName, int id) {
		try {
			sql = con.prepareStatement("update Student set FirstMidName=? where id=?");
			sql.setString(1, firstMidName);
			sql.setInt(2, id);
			int judge = sql.executeUpdate();
			if (judge > 0)
				System.out.println("修改成功");
			else
				System.out.println("修改失败");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void deleteById(int id)
	{
		try {
			sql = con.prepareStatement("delete Student where id=?");
			sql.setInt(1, id);
			int judge = sql.executeUpdate();
			if (judge > 0)
				System.out.println("删除成功");
			else
				System.out.println("删除失败");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void seletcList()
	{
		try {
			sql = con.prepareStatement("SELECT * from  Student");
			res = sql.executeQuery();
			while (res.next()) {
				int id1 = res.getInt("ID");
				String lastName = res.getString("LastName");
				String firstMidName = res.getString("FirstMidName");
				System.out.println(String.format("Id:%s,姓氏:%s,FirstMidName:%s", id1, lastName, firstMidName));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Prep p = new Prep();
		p.seletcById(3);
		p.insert("小王","什么鬼");
		p.update("什么东西" + (int) (1 + Math.random() * 1000), 1002);
		p.deleteById(1002);
		p.seletcList();
	}

}
