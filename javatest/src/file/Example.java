package file;

import java.io.*;

public class Example {

	public static void main(String[] args) {
		try {
			FileOutputStream fs=new FileOutputStream("word.txt");
			DataOutputStream ds=new DataOutputStream(fs);
			ds.writeUTF("使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；使用writeUTF（）方法写入数据；");
			ds.writeBytes("使用writeByte（）方法写入数据；");
			ds.close();
			
			FileInputStream fis=new FileInputStream("word.txt");
			DataInputStream dis=new DataInputStream(fis);
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
