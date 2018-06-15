package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RecordReflex {

	public static void main(String[] args) {
		Record record = new Record();
		Class recordC = record.getClass();
		Constructor[] declaredConstructor = recordC.getDeclaredConstructors();
		System.out.println("-------构造函数反射Annotation-------");
		for (int i = 0; i < declaredConstructor.length; i++) {
			Constructor constructor = declaredConstructor[i];
			if (constructor.isAnnotationPresent(Constructor_Annotation.class)) {
				Constructor_Annotation ca = (Constructor_Annotation) constructor.getAnnotation(Constructor_Annotation.class);
				System.out.println(ca.value());//获得注释信息
			}
			Annotation[][] parameterAnnotations=constructor.getParameterAnnotations();//获得参数的注释
			for (int j = 0; j < parameterAnnotations.length; j++) {
				int length=parameterAnnotations[j].length;
				if(length==0)
					System.out.println("  未添加Annotation的参数");
				else
					for (int k = 0; k <length; k++) {
						Fiele_Method_Parameter_Annotation pa=(Fiele_Method_Parameter_Annotation) parameterAnnotations[j][k];
						System.out.println("   "+pa.describe());//获取参数描述
						System.out.println("   "+pa.type());//获取参数类型
					}
			}
			System.out.println(" ");
		}
		System.out.println("-------成员变量反射Annotation-------");
		Field[] declaredField=recordC.getDeclaredFields();
		for (int i = 0; i < declaredField.length; i++) {
			Field field=declaredField[i];
			if(field.isAnnotationPresent(Fiele_Method_Parameter_Annotation.class))
			{
				Fiele_Method_Parameter_Annotation fp=field.getAnnotation(Fiele_Method_Parameter_Annotation.class);
				System.out.println("    "+fp.describe());//获得注释信息
				System.out.println("    "+fp.type());//获得字段的类型
			}
		}
		
		System.out.println("-------方法反射Annotation-------");
		Method[] declaredMethod=recordC.getDeclaredMethods();
		for (int i = 0; i < declaredMethod.length; i++) {
			Method method=declaredMethod[i];
			if(method.isAnnotationPresent(Fiele_Method_Parameter_Annotation.class))
			{
				Fiele_Method_Parameter_Annotation fp=method.getAnnotation(Fiele_Method_Parameter_Annotation.class);
				System.out.println("    "+fp.describe());//获得注释信息
				System.out.println("    "+fp.type());//获得字段的类型
			}
			Annotation[][] methodAnnotations=method.getParameterAnnotations();
			for (int j = 0; j < methodAnnotations.length; j++) {
				int length=methodAnnotations[j].length;
				if(length==0)
					System.out.println("  未添加Annotation的参数");
				else
					for (int k = 0; k <length; k++) {
						Fiele_Method_Parameter_Annotation pa=(Fiele_Method_Parameter_Annotation) methodAnnotations[j][k];
						System.out.println("   "+pa.describe());//获取参数描述
						System.out.println("   "+pa.type());//获取参数类型
					}
			}
			
			System.out.println("    ");
		}
		
	}

}
