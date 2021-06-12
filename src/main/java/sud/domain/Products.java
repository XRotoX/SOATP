package sud.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {
	
	@XmlElement(name = "product") 
	private List<Product> products;
	
	public Products() {
		super();
	}
	
	public Products(List<Product> products) {
		this.products = products;
	}
	
	public long add(Product product) {
		products.add(product);
		return products.size();
	}
	
	public Product get(long id) {
		for(Product product: products) {
			if(id == product.getId()) {
				return product;
			}
		}
		return null;
	}
	
	public boolean remove(long id) {
		for(Product product: products) {
			if(id == product.getId()) {
				int index = products.indexOf(product);
				products.remove(index);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAll() {
		return products.removeAll(products);
	}
	

}
