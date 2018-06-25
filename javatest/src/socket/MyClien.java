package socket;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MyClien extends JFrame {
	private PrintWriter writer;
	Socket socket;
	private JTextArea ta = new JTextArea();
	private JTextField tf = new JTextField();
	Container cc;

	public MyClien(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cc = this.getContentPane();
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		cc.add(tf, "South");
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writer.println(tf.getText());
				ta.append(tf.getText() + "\n");
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");

			}
		});
	}

	private void coonect() {
		ta.append("尝试连接\n");
		try {
			socket = new Socket("127.0.0.1", 8998);
			writer = new PrintWriter(socket.getOutputStream(), true);
			ta.append("完成连接\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyClien cilen=new MyClien("向服务器送数据");
		cilen.setSize(200, 200);
		cilen.setVisible(true);
		cilen.coonect();

	}

}
