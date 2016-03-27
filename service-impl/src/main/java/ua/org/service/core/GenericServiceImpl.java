package ua.org.service.core;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import ua.org.service.core.dto.AbstractIdentifiableDto;
import ua.org.service.exceptions.ValidationException;
import ua.org.service.validate.ValidationService;

public abstract class GenericServiceImpl<DTO extends AbstractIdentifiableDto> implements GenericService<DTO> {

    private static final Logger log = Logger.getLogger(GenericServiceImpl.class);
    @Autowired
    protected ValidationService validationService;



    protected void validate(DTO dto) throws ValidationException {
        validationService.validate(dto, "dto");
    }
}