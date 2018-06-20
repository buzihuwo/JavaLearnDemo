package myEnum;

interface d {
	public String getDescription();

	public int getI();
}

public enum AnyEunm implements d {
	ConstantsA {
		public String getDescription() {
			return "我是枚举成员A";
		}

		public int getI() {
			return i;
		}
	},
	ConstantsB {
		public String getDescription() {
			return "我是枚举成员B";
		}

		public int getI() {
			return i;
		}
	},
	ConstantsC {
		public String getDescription() {
			return "我是枚举成员C";
		}

		public int getI() {
			return i;
		}
	},
	ConstantsD {
		public String getDescription() {
			return "我是枚举成员D";
		}

		public int getI() {
			return i;
		}
	};
	private static int i = 5;

	public static void main(String[] args) {
		for (int i = 0; i < AnyEunm.values().length; i++) {
			System.out.println(AnyEunm.values()[i] + "调用getDescription（）方法" + AnyEunm.values()[i].getDescription());
			System.out.println(AnyEunm.values()[i] + "调用getI（）方法" + AnyEunm.values()[i].getI());
		}

	}

}
