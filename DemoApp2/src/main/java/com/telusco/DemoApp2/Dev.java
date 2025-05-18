package com.telusco.DemoApp2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //this autowire helps in linking two classes that is we can use the laptop class in the dev class using autowire
    //this is termed as field injection
    @Autowired
    private Laptop laptop;
    //three types of dependency injection one is field injection,constructor injection,setter injection where the autowire is default in constructor and for field and setter injection will have to import autowire by default

    public void build(){
        laptop.compile();
        //so when we use the component annotation it means that we have created the bean that can be used by the application context
        System.out.println("Successfully was able to run the spring boot application");
    }
}
