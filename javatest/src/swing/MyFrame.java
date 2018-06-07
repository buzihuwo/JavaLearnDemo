package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyjDialog extends JDialog {
	public MyjDialog(MyFrame frame) {
		super(frame, "第一个窗体", true);
		Container container = getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setBounds(120, 120, 100, 100);
	}
}

public class MyFrame extends JFrame {

	public static void main(String[] args) {
		new MyFrame();
	}

	public MyFrame() {
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("弹出对话框");
		bl.setBounds(10, 10, 100, 21);
		bl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new MyjDialog(MyFrame.this).setVisible(true);
			}
		});
		container.add(bl);
		this.setVisible(true);
		this.setSize(400, 250);
	}

}
