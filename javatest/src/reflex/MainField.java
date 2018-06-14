package reflex;

import java.lang.reflect.*;

public class MainField {

	public static void main(String[] args) {
		ExampleField example = new ExampleField();
		Class exampleC = example.getClass();
		Field[] declaredField = exampleC.getDeclaredFields();
		for (int i = 0; i < declaredField.length; i++) {
			Field field = declaredField[i];
			System.out.println("名称为:" + field);
			Class fieldType = field.getType();
			System.out.println("类型为:" + fieldType);
			boolean isTum = true;
			while (isTum) {
				try {
					isTum = false;
					System.out.println("修改前的值为：" + field.get(example));
					if (fieldType.equals(int.class)) {
						System.out.println("利用方法setInt（）修改成员变量的值");
						field.setInt(example, 168);
					} else if (fieldType.equals(float.class)) {
						System.out.println("利用方法setFloat（）修改成员变量的值");
						field.setFloat(example, 99.9F);
					} else if (fieldType.equals(boolean.class)) {
						System.out.println("利用方法setBoolean（）修改成员变量的值");
						field.setBoolean(example, true);
					} else if (fieldType.equals(String.class)) {
						System.out.println("利用方法setString（）修改成员变量的值");
						field.set(example, "王二麻子");
					}
					System.out.println("修改后的值为：" + field.get(example));
				} catch (Exception e) {
					System.out.println("在设置成员变量值时抛出异常，" + "下面执行setAccessible()方法");
					field.setAccessible(true);
					isTum = true;
				}
			}
			System.out.println();
		}
	}

}
