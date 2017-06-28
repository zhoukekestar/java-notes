package io.github.zhoukekestar.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailHelper implements ConstraintValidator<Email, String> {

	public void initialize(Email arg0) {

	}

	public boolean isValid(String value, ConstraintValidatorContext ctx) {
		if (value == "email") {
			return true;
		}
		return false;
	}

}
