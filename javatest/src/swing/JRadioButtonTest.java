package swing;

import java.awt.*;

import javax.swing.*;

public class JRadioButtonTest extends JFrame {

	public JRadioButtonTest() {
		Container c = getContentPane();
		setLayout(new BorderLayout());
		setSize(200, 100);
		setTitle("单选框");
		JPanel panel=new JPanel();
		JRadioButton j1 = new JRadioButton("男");
		JRadioButton j2 = new JRadioButton("女");
		JRadioButton j3 = new JRadioButton("未知");
		ButtonGroup group = new ButtonGroup();
		group.add(j1);
		group.add(j2);
		group.add(j3);
		
		
		panel.add(j1);
		panel.add(j2);
		panel.add(j3);
		c.add(panel, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButtonTest();
	}

}