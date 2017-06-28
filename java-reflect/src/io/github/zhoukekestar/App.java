package io.github.zhoukekestar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Class reflect = Class.forName("io.github.zhoukekestar.Reflect");
		Method show = reflect.getDeclaredMethod("show", String.class);
		show.invoke(null, "World! by show(msg)");
		
		show = reflect.getDeclaredMethod("show");
		show.invoke(new Reflect("World! by show()"));
	}

}
