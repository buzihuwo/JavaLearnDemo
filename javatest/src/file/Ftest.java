package file;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.*;

public class Ftest extends JFrame {

	private JPanel jContentPane = null;
	private JTextArea jTextArea = null;
	private JPanel contentPane = null;
	private JButton openButton = null;
	private JButton closeButton = null;

	private JScrollPane getJTextArea() {
		jTextArea = new JTextArea(5, 1);
		jTextArea.setLineWrap(true);
		jTextArea.setWrapStyleWord(true);
		jTextArea.setBorder(BorderFactory.createLineBorder(Color.gray, 5));
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		return jScrollPane;
	}

	private JButton getOpenButton() {
		if (openButton == null) {
			openButton = new JButton("写入文件");
			openButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file = new File("word.txt");
					try {
						FileWriter out = new FileWriter(file);
						String s = jTextArea.getText();
						out.write(s);
						out.close();
						JOptionPane.showMessageDialog(null, "写入成功");
						jTextArea.setText("");
					} catch (Exception e2) {
						e2.printStackTrace();
					}

				}
			});
		}
		return openButton;
	}

	private JButton getcloseButton() {
		if (closeButton == null) {
			closeButton = new JButton("读取文件");
			closeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File file = new File("word.txt");
					try {
						FileReader in = new FileReader(file);
						int length= (int) file.length();
						char c[] = new char[length];
						int len = in.read(c);
						jTextArea.setText(new String(c, 0, len));
						in.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}

				}
			});
		}
		return closeButton;
	}

	private JPanel getjContentPane() {
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(1, 2, 5, 5));
		openButton = getOpenButton();
		closeButton = getcloseButton();
		contentPane.add(openButton);
		contentPane.add(closeButton);
		return contentPane;
	}

	public Ftest() {
		super();
		initialize();
	}

	private void initialize() {
		this.setTitle("文件处理");
		this.setContentPane(getJContentPane());
		this.setSize(300, 200);
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJTextArea(), BorderLayout.CENTER);
			jContentPane.add(getjContentPane(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	public static void main(String[] args) {
		Ftest ftest = new Ftest();
		ftest.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ftest.setVisible(true);

	}

}
