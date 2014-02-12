package springtest.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springtest.context.Bean1;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Bean1 bean1 = context.getBean("bean1", Bean1.class);
		System.out.println(bean1);
	}
}
