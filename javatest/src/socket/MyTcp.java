package socket;

import java.io.*;
import java.net.*;

public class MyTcp {

	private BufferedReader reader;
	private ServerSocket server;
	private Socket socket;

	void getServer() {
		try {
			server = new ServerSocket(8998);
			System.out.println("服务器Socket已经创建成功");
			while (true) {
				System.out.println("等待客户机的连接");
				socket = server.accept();
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				getClientMessage();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getClientMessage() {
		try {
			while (true) {
				System.out.println("客户端：" + reader.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (reader != null)
				reader.close();
			if (socket != null)
				socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyTcp top = new MyTcp();
		top.getServer();

	}

}
