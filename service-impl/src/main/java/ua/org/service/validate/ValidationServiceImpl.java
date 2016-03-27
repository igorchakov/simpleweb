package ua.org.service.validate;

import org.springframework.stereotype.Service;
import ua.org.service.exceptions.ValidationException;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Override
    public void validate(Object target, String objectName, Object... validationHints) throws ValidationException {

    }
}