package io.github.zhoukekestar.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(value = ElementType.PARAMETER)
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { EmailHelper.class })
public @interface Email {
	// https://stackoverflow.com/questions/37557289/no-annotations-present-when-reflecting-a-method-using-class-getdeclaredmethod
	
	String message() default "Email is invalid.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
