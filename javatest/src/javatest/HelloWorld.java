package javatest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.Thread.State;

import javax.swing.table.TableStringConverter;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		//// System.out.println("Hello World");
		// String c;
		// System.out.println("Enter lines of text.");
		// System.out.println("Enter 'end' to quit.");
		// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//// System.out.println("输出字符，按下'q'键退出。");
		// do {
		// c=br.readLine();
		// System.out.println(c);
		// } while (!c.equals("end"));

		// int a ;
		// a='A';
		// System.out.println(a);

		try {
			byte bwrite[] = { 11, 21, 40, 5 };
			OutputStream os = new FileOutputStream("test.txt");// 写入文件
			for (int i = 0; i < bwrite.length; i++) {
				os.write(bwrite[i]);
			}
			os.close();

			InputStream is = new FileInputStream("test.txt");// 读文件
			int size = is.available();
			for (int i = 0; i < size; i++) {
				System.out.println((char) is.read() + "  ");
			}
			is.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
