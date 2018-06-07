package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JButtonTest extends JFrame {

	public JButtonTest() {
		setLayout(new GridLayout(3, 1, 5, 5));
		Container c = getContentPane();
		for (int i = 0; i < 5; i++) {
			JButton j = new JButton("button" + i);
			c.add(j);
			if (i % 2 == 0)
				j.setEnabled(false);
		}
		JButton jb = new JButton("有事件的按钮");
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener() {// 点击事件
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		c.add(jb);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButtonTest();
	}

}
