package ua.org.service.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractConverter<SOURCE, TARGET> implements Converter<SOURCE, TARGET> {

    @Override
    public TARGET convert(SOURCE source) {
        if (source == null) {
            return null;
        }
        TARGET result = generateTarget();
        convert(source, result);
        return result;
    }

    protected abstract TARGET generateTarget();

    @Override
    public List<TARGET> convert(Collection<SOURCE> sources) {
        List<TARGET> result = new ArrayList<TARGET>(sources.size());
        for (SOURCE source : sources) {
            result.add(convert(source));
        }
        return result;
    }
}