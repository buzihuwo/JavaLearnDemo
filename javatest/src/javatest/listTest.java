package javatest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("HAHAHAHA");

		// 第一种遍历方法使用foreach遍历List
		 for (String str : list) {
		 System.out.println(str);
		 }

		// 第二种遍历，把链表变为数组相关的内容进行遍历
		 String[] strArray = new String[list.size()];
		 list.toArray(strArray);
		 for (String str : strArray) {
		 System.out.println(str);
		 }

		// 第三种遍历 使用迭代器进行相关遍历
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
