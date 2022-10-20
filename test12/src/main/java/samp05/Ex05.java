package samp05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex05 {
	public static void main(String[] args) {
		AbstractApplicationContext ac = new GenericXmlApplicationContext("/samp05/beans05.xml");
		BookService bs = ac.getBean(BookService.class);
		Book book = bs.getBook();
		System.out.println(book);
		ac.close();
	}
}
