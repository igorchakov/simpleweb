package ua.org.service.exceptions;

import java.util.Map;

public class ValidationException extends RuntimeException {

    private final static String standardMessage = "During system operation errors occurred!";
    private Map<String, String> messageMap;


    public ValidationException(Map<String, String> messageMap) {
        super(standardMessage);
        this.messageMap = messageMap;
    }

    public Map<String, String> getMessageMap() {
        return messageMap;
    }

    public void setMessageMap(Map<String, String> messageMap) {
        this.messageMap = messageMap;
    }
}