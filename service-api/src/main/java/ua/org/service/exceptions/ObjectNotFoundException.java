package ua.org.service.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    private static String standardMessage = "During system operation errors occurred!";
    private Class clazz;
    private Object id;


    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(Class clazz, Object id) {
        super(standardMessage);
        this.clazz = clazz;
        this.id = id;
    }

    public Object getId() {
        return id;
    }

    public Class getClazz() {
        return clazz;
    }
}