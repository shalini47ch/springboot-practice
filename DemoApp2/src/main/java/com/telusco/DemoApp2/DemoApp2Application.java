package com.telusco.DemoApp2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApp2Application {
	public static void main(String[] args) {
		//this is already the one in the Ioc Container
		//we will create an application Context obj so that we can talk to ioc container
		//this is an example of dependency injection
		SpringApplication.run(DemoApp2Application.class, args);

	}
}
