package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JCheckBoxTest extends JFrame {

	public JCheckBoxTest() {
		Container c = getContentPane();
		setTitle("多选框");
		setSize(250, 250);
		// setLocationRelativeTo(null);
		c.setLayout(new GridLayout(2, 1, 5, 5));

		JPanel panel = new JPanel(new GridLayout(2, 1, 5, 5));
		JPanel panel1 = new JPanel();
		
		JTextArea ta = new JTextArea(5, 10);
	
		
		
		JScrollPane sp=new JScrollPane(ta);
		JCheckBox checkBox01 = new JCheckBox("菠萝");
		JCheckBox checkBox02 = new JCheckBox("香蕉");
		JCheckBox checkBox03 = new JCheckBox("雪梨");
		JCheckBox checkBox04 = new JCheckBox("荔枝");
		panel.add(sp);
		panel1.add(checkBox01);
		panel1.add(checkBox02);
		panel1.add(checkBox03);
		panel1.add(checkBox04);
		panel.add(panel1);
		c.add(panel);

		checkBox01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					ta.append(checkBox.getText() + "被选中\n");
				} else {
					ta.setText(ta.getText().replace(checkBox.getText() + "被选中\n", ""));
				}
			}
		});
		checkBox02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					ta.append(checkBox.getText() + "被选中\n");
				} else {
					ta.setText(ta.getText().replace(checkBox.getText() + "被选中\n", ""));
				}
			}
		});
		checkBox03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					ta.append(checkBox.getText() + "被选中\n");
				} else {
					ta.setText(ta.getText().replace(checkBox.getText() + "被选中\n", ""));
				}
			}
		});
		checkBox04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox checkBox = (JCheckBox) e.getSource();
				if (checkBox.isSelected()) {
					ta.append(checkBox.getText() + "被选中\n");
				} else {
					ta.setText(ta.getText().replace(checkBox.getText() + "被选中\n", ""));
				}
			}
		});
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JCheckBoxTest();
	}

}