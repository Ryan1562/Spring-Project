package samp03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex03 {
	public static void main(String[] args) {
		AbstractApplicationContext ac = 
			new GenericXmlApplicationContext("/samp03/beans03.xml");
		MessageBean mb = ac.getBean(MessageBean.class);
		mb.sayHello();
		ac.close();
	}
}
