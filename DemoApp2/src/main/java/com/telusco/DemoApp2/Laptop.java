package com.telusco.DemoApp2;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile(){
        //in case there is a confusion when we use interface in that case we can use the annotation as primary to give preference to one as compared to other
        //if you don't want to use primary in your beans then you can use Qualifier("laptop") with the name of the instance in small letters
        System.out.println("The program compiled successfully with 0 errors");
    }
}
