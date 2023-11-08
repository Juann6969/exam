package Examen.FullStack.examen.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DescripcionArtworkValidation implements ConstraintValidator<DescripcionArtworkValidator, String>{	 

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
	  // TODO Auto-generated method stub
	  if (value == null || value.trim().isEmpty()) {
		  return false;
	  }
	  String[] word = value.split("\s+");
	  return word.length >= 5;
	    }

	}