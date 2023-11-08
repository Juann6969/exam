package Examen.FullStack.examen.validators;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.fasterxml.jackson.core.util.RequestPayload;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(CLASS)
@Target(FIELD)
@Constraint(validatedBy = DescripcionArtworkValidation.class)
public @interface DescripcionArtworkValidator {
	String mensaje() default "En la descripción de la obra debe haber al menos 5 palabras";
	Class<?>[] groups() default {};
	Class <? extends Payload>[] paylaod() default{};
}
