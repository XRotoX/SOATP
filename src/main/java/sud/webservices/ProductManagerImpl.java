package sud.webservices;

import javax.jws.WebService;

@WebService(endpointInterface = "sud.webservices.productManager")
public class ProductManagerImpl implements ProductsManager {
 
	private static Products products = new Products(new ArrayList<>());
	
	public long addProducts(Product product) {
		
	}
	
}
