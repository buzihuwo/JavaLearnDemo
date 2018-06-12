package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("word.txt");
		System.out.println(file.getAbsolutePath());
		if (file.exists())// 文件存在
		{
			file.delete();
			System.out.println("文件已删除");
		} else {
			try {
				file.createNewFile();// 创建文件
				System.out.println("文件已创建");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (file.isFile()) {
			System.out.println(file.getName());
			System.out.println("文件的长度：" + file.length());
			System.out.println("文件是否隐藏：" + file.isHidden());
			myOutput(file);
			myInput(file);
		} else {
			System.out.println("文件不存在");
		}

	}

	private static void myOutput(File file) {
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte buy[] = "我有一只小毛驴，我从来都不骑。".getBytes();
			out.write(buy);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void myInput(File file) {
		try {
			FileInputStream input = new FileInputStream(file);
			byte buy[]=new byte[0124];
			int len=input.read(buy);
			System.out.println("文件中的信息是："+new String(buy,0,len));
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
