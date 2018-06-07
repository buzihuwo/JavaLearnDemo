package javatest;

public class MathRondom {
	public static int GetEcenNum(double num1, double num2) {
		int s = (int) num1 + (int) (Math.random() * (num2 - num1));
		if (s % 2 == 0)
			return s;
		else
			return s + 1;
	}

	public static char GetRandomChar(char char1, char char2) {
		return (char) (char1 + Math.random() * (char2 - char1 + 1));
	}

	public static void main(String[] args) {
//		System.out.println(GetEcenNum(2, 32));
		System.out.println(GetRandomChar('a','M'));
	}
}
