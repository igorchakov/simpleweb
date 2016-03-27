package ua.org.service.validate;

import ua.org.service.exceptions.ValidationException;

public interface ValidationService {

    public void validate(Object target, String objectName, Object... validationHints) throws ValidationException;
}