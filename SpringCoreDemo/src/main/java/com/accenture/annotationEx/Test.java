package com.accenture.annotationEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(BeanGenerator.class);
		HelloWorldBean hwb=ctx.getBean(HelloWorldBean.class);
		hwb.sayHello();
	}

}
