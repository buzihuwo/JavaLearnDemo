package swing;

import java.awt.*;

import javax.swing.*;

public class jScrollPaneTest extends JFrame {

	public jScrollPaneTest() {
		Container c = getContentPane();
		JTextArea ta=new JTextArea(20,50);
		JScrollPane sp=new JScrollPane(ta);
		c.add(sp);
		setTitle("带滚动条的文字编译器");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new jScrollPaneTest();
	}

}