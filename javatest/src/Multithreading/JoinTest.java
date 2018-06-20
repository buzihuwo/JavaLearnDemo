package Multithreading;

import java.awt.BorderLayout;

import javax.swing.*;

//线程优先执行,另一线程等待
public class JoinTest extends JFrame {

	private Thread threadA;
	private Thread threadB;
	final JProgressBar jProgressBar = new JProgressBar();// 定义进度条组件
	final JProgressBar jProgressBar2 = new JProgressBar();
	int count = 0;

	public JoinTest() {
		super();
		getContentPane().add(jProgressBar, BorderLayout.NORTH);
		getContentPane().add(jProgressBar2, BorderLayout.SOUTH);
		jProgressBar.setStringPainted(true);// 设置进度条显示数字字符
		jProgressBar2.setStringPainted(true);
		threadA = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					jProgressBar.setValue(++count);
					try {
						Thread.sleep(100);
						if (count == 10)
							threadB.join();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		});
		threadA.start();
		threadB = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					jProgressBar2.setValue(++count);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (count == 100)
						break;
				}
			}
		});
		threadB.start();
	}

	private static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		init(new JoinTest(), 100, 100);
	}

}
