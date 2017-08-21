package org.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<IsValidName, String> {

	private String isValidName;

	@Override
	public void initialize(IsValidName isValidName) {
		this.isValidName = isValidName.listOfNames();
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext arg1) {
		
		System.out.println(isValidName + " " + name);
		
		if (name == null)
			return false;
		else if (name.split(" ")[1].startsWith(isValidName)) {
			return true;
		} else {
			return false;
		}
	}

}
