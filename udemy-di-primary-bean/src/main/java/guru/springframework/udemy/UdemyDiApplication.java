package guru.springframework.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.udemy.controllers.ConstructorInjectedController;
import guru.springframework.udemy.controllers.MyController;
import guru.springframework.udemy.controllers.PropertyInjectedController;
import guru.springframework.udemy.controllers.SetterInjectedController;

@SpringBootApplication
public class UdemyDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UdemyDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
