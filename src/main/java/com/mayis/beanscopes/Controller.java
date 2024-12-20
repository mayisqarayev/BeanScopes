package com.mayis.beanscopes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final PrototypeBean prototypeBean1;
    private final PrototypeBean prototypeBean2;

    public Controller(PrototypeBean prototypeBean1, PrototypeBean getPrototypeBean2) {
        this.prototypeBean1 = prototypeBean1;
        this.prototypeBean2 = getPrototypeBean2;
    }


    @GetMapping("/get")
    public String getInstances()
    {
        prototypeBean1.setInstance("Bean 1 initialized");
        prototypeBean2.setInstance("Bean 2 initialized");

        return prototypeBean1.getInstance() + "   " + prototypeBean2.getInstance();
    }
}
