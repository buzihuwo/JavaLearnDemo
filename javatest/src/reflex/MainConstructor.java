package reflex;

import java.lang.reflect.*;

public class MainConstructor {

	public static void main(String[] args) {
		ExampieConstructor exampie = new ExampieConstructor("10", "20", "30");
		Class<? extends ExampieConstructor> exampleC = exampie.getClass();
		Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();// 获取所有的构造函数
		for (int i = 0; i < declaredConstructors.length; i++) {
			Constructor<?> constructor = declaredConstructors[i];
			System.out.println("查看是否允许带有可变数量的参数：" + constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次为：");
			Class[] parameterTypaes = constructor.getParameterTypes();// 获取所有参数类型
			for (int j = 0; j < parameterTypaes.length; j++) {
				System.out.println(" " + parameterTypaes[j]);
			}
			System.out.println("该构造方法可能抛出的异常类型为：");
			Class[] exxeptionTypes = constructor.getExceptionTypes();// 获取所有异常类型
			for (int j = 0; j < exxeptionTypes.length; j++) {
				System.out.println(" " + exxeptionTypes[j]);
			}

			ExampieConstructor exampie2 = null;
			while (exampie2 == null) {
				try {
					if (i == 1) {
						exampie2 = (ExampieConstructor) constructor.newInstance("7", 5);
					} else if (i == 2) {
						exampie2 = (ExampieConstructor) constructor.newInstance();
					} else {
						Object[] parameters = new Object[] { new String[] { "100", "200", "300" } };
						exampie2 = (ExampieConstructor) constructor.newInstance(parameters);
					}
				} catch (Exception e) {
					System.out.println("再创建对象时抛出异常，下面执行setAccessible()方法");
					constructor.setAccessible(true);//
				}

			}
			if (exampie2 != null) {
				exampie2.print();
				System.out.println();
			}

		}
	}

}
