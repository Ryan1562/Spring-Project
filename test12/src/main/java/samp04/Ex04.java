package samp04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex04 {
	public static void main(String[] args) {
		AbstractApplicationContext ac =
			new GenericXmlApplicationContext("/samp04/beans04.xml");
		ProductService ps = ac.getBean(ProductService.class);
		Product product = ps.getProduct();
		System.out.println(product);
		ac.close();
	}
}
