package hu.mavrt.tutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"appContext.xml");

		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
	}
}