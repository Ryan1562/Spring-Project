package samp02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex02 {
	public static void main(String[] args) {
		AbstractApplicationContext ac = new GenericXmlApplicationContext("/samp02/beans02.xml");
		MessageBean mb = ac.getBean("proxy",MessageBean.class);
		mb.sayHello();
		ac.close();
	}
}
