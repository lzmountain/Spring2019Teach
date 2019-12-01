package com.nj.chinasofti.events;


import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class WarnMsgEvent extends ApplicationContextEvent {
    public String getTargetAddress() {
        return targetAddress;
    }

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    String targetAddress;
    String context;
    public WarnMsgEvent(ApplicationContext source,String targetAddress,String context) {
        super(source);
        this.targetAddress = targetAddress;
        this.context = context;
    }

    public WarnMsgEvent(ApplicationContext source) {
        super(source);
    }
}
