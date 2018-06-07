package javatest;

import java.util.Date;

class Animal {
	void eat() {
		System.out.println("animal:eat");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog:eat");
	}

	void eatTest() {
		this.eat();// 自己的方法
		super.eat();// 父类的方法
	}
}

public class Test {
	public static void main(String[] args) {
		String hh = "We.are.students";

		String a = "a";
		String b = "b";

		Date date = new Date();
		String ss = String.format("%tF", date);
		System.out.println(ss);

		// int ss=hh.lastIndexOf(" ");
		// String[] h1=hh.split("\\.", 2);
		// for (String a1 : h1) {
		// System.out.println(a1);
		// }

		// System.out.println(a.compareTo(b));

		// Animal a = new Animal();
		// a.eat();
		// Dog d = new Dog();
		// d.eatTest();
	}
}