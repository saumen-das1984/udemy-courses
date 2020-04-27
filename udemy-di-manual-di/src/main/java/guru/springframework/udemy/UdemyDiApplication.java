package guru.springframework.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.udemy.controllers.MyController;

@SpringBootApplication
public class UdemyDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UdemyDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
