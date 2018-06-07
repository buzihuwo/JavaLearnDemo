package javatest;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void getData(List<?> data) {
		System.out.println("data ：" + data.get(0));
	}

	public static void getUperNumber(List<? extends Number> data) {
		System.out.println("data ：" + data.get(0));
	}
	public static void main(String[] args) {
		List<Integer> age = new ArrayList<Integer>();
		List<String> name = new ArrayList<String>();
		List<Number> number = new ArrayList<Number>();
		age.add(18);
		name.add("icom");
		number.add(314);

//		getData(name);
//		getData(age);
//		getData(number);
		
		getUperNumber(age);
		getUperNumber(number);
	}
}
