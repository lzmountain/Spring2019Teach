package com.nj.chinasofti.events;

import org.springframework.context.ApplicationListener;

public class WarnMsgListener implements ApplicationListener<WarnMsgEvent> {

    @Override
    public void onApplicationEvent(WarnMsgEvent warnMsgEvent) {
        System.out.println("发生的事件:信息发送的目标是:"+warnMsgEvent.getTargetAddress()+
                ",消息是:"+warnMsgEvent.getContext());
    }
}
