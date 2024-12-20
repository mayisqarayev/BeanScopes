package com.mayis.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class SingletonBean {

    private String instance;

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }
}
