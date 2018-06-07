package swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutPosltlon extends JFrame {

	public GridLayoutPosltlon() {
		setTitle("这是一个使用网格布局管理器");
		Container c = getContentPane();
		setLayout(new GridLayout(7, 3, 5, 5));
		for (int i = 0; i < 20; i++) {
			c.add(new JButton("button" + i));
		}
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutPosltlon();
	}

}
