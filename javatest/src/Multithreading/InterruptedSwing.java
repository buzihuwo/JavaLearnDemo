package Multithreading;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javatest.lnterfacelnner;
///线程的中断
public class InterruptedSwing extends JFrame {

	Thread thread;

	public InterruptedSwing() {
		super();
		final JProgressBar progressBar = new JProgressBar();
		getContentPane().add(progressBar, BorderLayout.NORTH);
		progressBar.setStringPainted(true);
		thread = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar.setValue(++count);
					try {
						thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("当前线程序被中断");
						break;
					}
				}
			}
		});
		
		final JButton jButton = new JButton("重置");
		getContentPane().add(jButton, BorderLayout.SOUTH);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread.interrupt();//线程的中断
				
			}
		});
		thread.start();
		
	}

	private static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		init(new InterruptedSwing(), 100, 100);
	}

}
