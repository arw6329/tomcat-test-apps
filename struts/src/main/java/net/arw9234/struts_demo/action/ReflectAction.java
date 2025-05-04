package net.arw9234.struts_demo.action;

import net.arw9234.struts_demo.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.parameter.StrutsParameter;

public class ReflectAction extends ActionSupport {
    private String param;
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore("You submitted: " + param);
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    @StrutsParameter
    public void setParam(String param) {
        this.param = param;
    }
}
