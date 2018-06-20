package Multithreading;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
///用Runnable创建线程
public class SwingAndThread extends JFrame {

	private JLabel jl = new JLabel();
	private static Thread t;
	private int conut = 0;
	public Container container = getContentPane();

	public SwingAndThread() {
		setBounds(300, 200, 250, 150);
		container.setLayout(new GridLayout(2, 1, 5, 5));
		URL url = SwingAndThread.class.getResource("/2.png");
		Icon iocn = new ImageIcon(url);
		jl.setIcon(iocn);
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		jl.setBounds(10, 10, 200, 50);
		jl.setOpaque(true);
		t = new Thread(new Runnable() {
			public void run() {
				while (conut <= 200) {
					jl.setBounds(conut, 10, 200, 50);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					conut += 4;
					if (conut == 200) {
						conut = 10;
					}
				}
			}
		});
		t.start();
		JButton jb = new JButton("重置");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conut = 0;
				jl.setBounds(10, 10, 200, 50);
			}
		});
		container.add(jl);
		container.add(jb);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingAndThread();
	}

}
