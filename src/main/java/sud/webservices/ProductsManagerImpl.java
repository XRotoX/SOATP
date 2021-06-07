package sud.webservices;

import java.util.ArrayList;

import javax.jws.WebService;

import sud.domain.Product;
import sud.domain.Products;
import sud.exceptions.NoSuchProductException;

@WebService(endpointInterface = "sud.webservices.ProductsManager")
public class ProductsManagerImpl implements ProductsManager {
 
	private static Products products = new Products(new ArrayList<Product>());

	public long addProduct(Product product) {

		return 0;
	}

	public Product getProduct(long id) throws NoSuchProductException {
		Product product = products.get(id);
		
		if(product != null) {
			return product;
		} else {
			throw new NoSuchProductException("No such product");
		}
	}

	public double getProductPrice(long id) throws NoSuchProductException {

		return 0;
	}

	public Products getProducts() {

		return null;
	}

	public Product updateProduct(Product product) {

		return null;
	}

	public boolean deleteProduct(long id) {

		return false;
	}

	public boolean deleteAllProducts() {

		return false;
	}
	
}
