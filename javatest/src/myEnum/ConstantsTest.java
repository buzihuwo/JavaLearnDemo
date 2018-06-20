package myEnum;

interface Constants {
	public static final int ConstantsA = 1;
	public static final int ConstantsB = 12;
}

public class ConstantsTest {
	enum Constans2 {
		ConstantsA, ConstantsB
	}

	public static void doit(int c) {
		switch (c) {
		case Constants.ConstantsA:
			System.out.println("doit() ConstantsA");
			break;
		case Constants.ConstantsB:
			System.out.println("doit() ConstantsB");
			break;
		}
	}
	
	public static void doit2(Constans2 c) {
		switch (c) {
		case ConstantsA:
			System.out.println("doit2() ConstantsA");
			break;
		case ConstantsB:
			System.out.println("doit2() ConstantsB");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		Constans2[] ss=Constans2.values();
		System.out.println(ss[0].toString());
		ConstantsTest.doit(Constants.ConstantsA);
		ConstantsTest.doit2(Constans2.ConstantsA);
		ConstantsTest.doit2(Constans2.ConstantsB);
		ConstantsTest.doit(3);
	}
}