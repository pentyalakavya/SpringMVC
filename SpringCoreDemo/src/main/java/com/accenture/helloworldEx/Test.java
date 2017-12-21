package com.accenture.helloworldEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Spring.xml");
		//HelloWorldBean hb=(HelloWorldBean) ctx.getBean("hellobean");
		/*HelloWorldBean hb= ctx.getBean("hellobean", HelloWorldBean.class);
		hb.sayHello();*/
BookStore store=(BookStore) ctx.getBean("stores");
store.display();
	}

}
