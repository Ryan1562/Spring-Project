package samp05;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements BookDao {

	public Book getBook(String title) {
		
		return new Book(title, 20000);
	}
	
}
