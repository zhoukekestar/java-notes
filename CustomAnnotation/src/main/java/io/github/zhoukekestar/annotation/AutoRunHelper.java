package io.github.zhoukekestar.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AutoRunHelper {
	public static void run(Class<?> target) {

		Method[] methods = target.getDeclaredMethods();

		for (int i = 0; i < methods.length; i++) {

			Method method = methods[i];
			AutoRun autoRun = method.getAnnotation(AutoRun.class);
			if (autoRun != null) {
				// System.out.println("method: " + methods[i].toString() + "
				// times:" + autoRun.times());
				int times = autoRun.times();

				while (times-- != 0) {
					try {
						method.invoke(null, null);
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}
}
