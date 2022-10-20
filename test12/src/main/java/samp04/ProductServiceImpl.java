package samp04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao pd;
	public Product getProduct() {
		
		return pd.getProduct("볼펜");
	}

}
