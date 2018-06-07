package swing;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;

public class JListTest extends JFrame{

	public JListTest() {
		setTitle("列表");
		setSize(300, 300);
		Container c=getContentPane();
		//第一种方式
//		String[] contents= {"列表1","列表2","列表3","列表4","列表5"};
//		JList jl=new JList(contents);
		//第二种方式
//		Vector contents=new Vector();
//		JList jl=new JList(contents);
//		contents.add("列表1");
//		contents.add("列表2");
//		contents.add("列表3");
//		contents.add("列表4");
//		contents.add("列表5");
		//第三种方式
		JList<String> jl=new JList<>(new MyListModel());
		c.add(jl);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JListTest();
	}

}

class MyListModel extends AbstractListModel<String>{
	private String[] contents= {"列表1","列表2","列表3","列表4","列表5"};
	public String getElementAt(int x)
	{
		if(x<contents.length)
			return contents[x++];
		else
			return null;
	}
	
	public int getSize() {
		return contents.length;
	}
}
