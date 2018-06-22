package Multithreading;

import java.awt.GridLayout;
import java.lang.reflect.GenericArrayType;

import javax.swing.*;
///   线程优先级
public class PriorityTest extends JFrame {

	private Thread threadA;
	private Thread threadB;
	private Thread threadC;
	private Thread threadD;
	private final JProgressBar jProgressBarA = new JProgressBar();
	private final JProgressBar jProgressBarB = new JProgressBar();
	private final JProgressBar jProgressBarC = new JProgressBar();
	private final JProgressBar jProgressBarD = new JProgressBar();

	private final class MyThread implements Runnable {
		private final JProgressBar bar;
		int count = 0;

		private MyThread(JProgressBar bar) {
			this.bar = bar;
		}

		public void run() {
			while (true) {
				bar.setValue(count += 10);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("当前线程被中断");
				}

			}
		}
	}

	private PriorityTest() {
		super();
		setLayout(new GridLayout(4, 1));
		getContentPane().add(jProgressBarA);
		getContentPane().add(jProgressBarB);
		getContentPane().add(jProgressBarC);
		getContentPane().add(jProgressBarD);
		jProgressBarA.setStringPainted(true);
		jProgressBarB.setStringPainted(true);
		jProgressBarC.setStringPainted(true);
		jProgressBarD.setStringPainted(true);
		threadA = new Thread(new MyThread(jProgressBarA));
		threadB = new Thread(new MyThread(jProgressBarB));
		threadC = new Thread(new MyThread(jProgressBarC));
		threadD = new Thread(new MyThread(jProgressBarD));
		setPriority("threadA", 5, threadA);
		setPriority("threadB", 5, threadB);
		setPriority("threadC", 4, threadC);
		setPriority("threadD", 3, threadD);
	}

	private void setPriority(String threadName, int priority, Thread thread) {
		thread.setPriority(priority);
		thread.setName(threadName);
		thread.start();
	}

	private static void init(JFrame frame, int width, int height) {
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		init(new PriorityTest(), 150, 150);

	}

}
