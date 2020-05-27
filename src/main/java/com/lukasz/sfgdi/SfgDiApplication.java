package com.lukasz.sfgdi;

import com.lukasz.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController =
				(I18nController) ctx.getBean("i18nController");
		i18nController.sayHello();

		System.out.println("--------- MyController");
		MyController myController = (MyController)ctx.getBean("myController");
		String ret = myController.sayHello();
		System.out.println(ret);

		System.out.println("--------- Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------- Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
