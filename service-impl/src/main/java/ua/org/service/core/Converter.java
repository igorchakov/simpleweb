package ua.org.service.core;

import java.util.Collection;

public interface Converter<SOURCE, TARGET> {

    TARGET convert(SOURCE source);

    void convert(SOURCE source, TARGET target);

    Collection<TARGET> convert(Collection<SOURCE> source);
}