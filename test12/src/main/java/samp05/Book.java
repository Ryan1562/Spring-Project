package samp05;

public class Book {
	private String title;
	private int price;
	
	public Book (String title, int price ) {
		this.title=title; this.price=price;				
	}
	
	public String toString() {
		
		return "제품 [이름 : "+title+", 가격 : "+price+"]";
	}
}
