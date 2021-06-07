package sud.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {
	
	@XmlElement(name = "product") 
	private List<Product> products;
	
	public Products() {
		products = new ArrayList<Product>();
	}
	
	public Products(List<Product> products) {
		this.products = products;
	}
	
	public long add(Product product) {
		products.add(product);
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
		products = new ArrayList<Product>();
	}
	

}
