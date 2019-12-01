package com.nj.chinasofti.initdestroy;

public class InitAndDestroy {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        System.out.println("设置value属性的值");
    }
    public void init(){
        System.out.println("调用了初始化的方法");
    }
    public void destroy(){
        System.out.println("Bean的销毁方法被调用");
    }
}
