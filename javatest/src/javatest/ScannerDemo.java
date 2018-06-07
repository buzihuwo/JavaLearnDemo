package javatest;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.println("next方法接受：");
		// if (scan.hasNext()) {
		// String str1 = scan.next();
		// System.out.println("输入的数据为：" + str1);
		// }
		// scan.close();
		double sum = 0;
		int m = 0;
		while (scan.hasNextDouble()) {
			double x = scan.nextDouble();
			m = m + 1;
			sum = sum + x;

		}
		System.out.println(m + "个数的和为" + sum);
		System.out.println(m + "个数的平均值是" + (sum / m));
		scan.close();
	}
}
