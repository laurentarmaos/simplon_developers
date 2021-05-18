package fr.formation.developers.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = { ValidFieldsValidator.class })
public @interface ValidFields {

	String message() default "Le nom et la description du projet doivent être différents";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
