package reflex;

import java.lang.reflect.*;

public class MainMethod {

	public static void main(String[] args) {
		ExampleMethod example = new ExampleMethod();
		Class exampleC = example.getClass();
		Method[] declareMethod = exampleC.getDeclaredMethods();
		for (int i = 0; i < declareMethod.length; i++) {
			Method method = declareMethod[i];
			System.out.println("名称为：" + method.getName());
			System.out.println("是否允许带可变数量的参数：" + method.isVarArgs());
			System.out.println("入口参数类型依次为：");
			Class[] exampleTypes = method.getParameterTypes();
			for (int j = 0; j < exampleTypes.length; j++) {
				System.out.println(" " + exampleTypes[j]);
			}
			System.out.println("返回值类型为：" + method.getReturnType());
			System.out.println("可能抛出的异常类型有：");
			Class[] exceptionTypes = method.getExceptionTypes();
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" " + exceptionTypes[j]);
			}
			boolean isTum = true;
			while (isTum) {
				try {
					isTum = false;
					if ("publicMethod".equals(method.getName())) {
						System.out.println("返回值为：" + method.invoke(example, 168));
					} else if ("protectedMethod".equals(method.getName())) {
						System.out.println("返回值为："+method.invoke(example, "7", 5));
							
					} else if ("privateMethod".equals(method.getName())) {
						Object[] parameters = new Object[] { new String[] { "Q", "W", "E", "R" } };
						System.out.println("返回值为：" + method.invoke(example, parameters));
					} else if ("staticMethod".equals(method.getName())) {
						method.invoke(example);
					}

				} catch (Exception e) {
					System.out.println("在执行方法时抛出异常，" + "下面执行setAccessible（）方法");
					method.setAccessible(true);
					isTum = true;
				}

			}
			System.out.println("");
		}
	}

}
