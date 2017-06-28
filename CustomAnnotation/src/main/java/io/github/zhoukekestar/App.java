package io.github.zhoukekestar;

import java.lang.reflect.Method;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.executable.ExecutableValidator;

import io.github.zhoukekestar.annotation.AutoRun;
import io.github.zhoukekestar.annotation.AutoRunHelper;
import io.github.zhoukekestar.annotation.Email;

/**
 * Hello world!
 *
 */

public class App {

	@AutoRun(times = 3)
	public static void showMsgThreeTimes() {
		System.out.println("AutoRun showMsgThreeTimes!");
	}
	
	@AutoRun
	public static void showSingleMsg() {
		System.out.println("AutoRun showSingleMsg!");
	}

	
	public void showEmail(@Email String email) {
		System.out.println("email :" + email);
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		AutoRunHelper.run(App.class);
		
		// 测试参数校验
		App app = new App();
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		ExecutableValidator executableValidator = factory.getValidator().forExecutables();
		Method method = App.class.getMethod("showEmail", String.class);
		
		Object[] parameterValues = {"email"};
		Set<ConstraintViolation<App>> violations = executableValidator.validateParameters(app, method, parameterValues);
		String message = violations.iterator().hasNext() ? violations.iterator().next().getMessage() : "";
		System.out.println("values:" + parameterValues[0].toString() + " size: " + violations.size() + " msg:" + message);
		
		Object[] parameterValues2 = {"abc"};
		violations = executableValidator.validateParameters(app, method, parameterValues2);
		message = violations.iterator().hasNext() ? violations.iterator().next().getMessage() : "";
		System.out.println("values:" + parameterValues2[0].toString() + " size: " + violations.size() + " msg:" + message);

	}
}
