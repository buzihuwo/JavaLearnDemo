package myEnum;

public class EunmMethodTest {
	enum Constants {
		ConstantsA, ConstantsB
	}

	public static void compare(Constants c) {
		for (int i = 0; i < Constants.values().length; i++) {
			System.out.println(c + "与" + Constants.values()[i] + "的比较结果为" + c.compareTo(Constants.values()[i]));
		}
	}

	enum myEnum {
		ConstantsA("我是枚举成员A"),
		ConstantsB("我是枚举成员B"),
		ConstantsC("我是枚举成员C"),
		ConstantsD(3);
		private String description;
		private int i = 4;

		private myEnum() {
		}

		private myEnum(String description) {
			this.description = description;
		}

		private myEnum(int i) {
			this.i = this.i + i;
		}
		
		public String getDescription() {
			return description;
		}
		public int getI() {
			return i;
		}
	}

	public static void main(String[] args) {
		compare(Constants.valueOf("ConstantsB"));

		for (int i = 0; i < Constants.values().length; i++) {
			System.out.println(Constants.values()[i] + " " + Constants.values()[i].ordinal());
		}
		
		
		for (int i = 0; i < myEnum.values().length; i++) {
			System.out.println(myEnum.values()[i]+"调用 getDescription()"+myEnum.values()[i].getDescription());
		}
		System.out.println(myEnum.valueOf("ConstantsD")+"调用 getI()"+myEnum.valueOf("ConstantsD").getI());
	}

}
