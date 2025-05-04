package net.arw9234.struts_demo.model;

public class MessageStore {
    private String message;
    
    public MessageStore(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
