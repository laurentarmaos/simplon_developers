package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.developers.domain.dtos.Project;

public class ValidFieldsValidator implements ConstraintValidator<ValidFields, Project> {

	@Override
	public boolean isValid(Project value, ConstraintValidatorContext context) {

		return !value.getName().equals(value.getDescription());

	}

}
