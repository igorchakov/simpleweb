package ua.org.core.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextHolder.applicationContext = applicationContext;
    }

    public static <T> T getBean(String name, Class<T> requiredType) {
        return applicationContext.getBean(name, requiredType);
    }

    public static String getProperty(String key) {
        return applicationContext.getEnvironment().getProperty(key);
    }

    public static <T> T getProperty(String key, Class<T> requiredType) {
        return applicationContext.getEnvironment().getProperty(key, requiredType);
    }

    public static String getApplicationProperty(String key) {
        return applicationContext.getBean("applicationProperties", Properties.class).getProperty(key);
    }

    public static String getApplicationProperty(String key, String defaultValue) {
        return applicationContext.getBean("applicationProperties", Properties.class).getProperty(key, defaultValue);
    }
}