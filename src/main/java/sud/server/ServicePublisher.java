package sud.server;

import javax.xml.ws.Endpoint;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import sud.webservices.ProductsManagerImpl;

public class ServicePublisher {

	private static Logger logger = (Logger) LoggerFactory.getLogger(ServicePublisher.class);
	public static void main(String[] args) {
		
		logger.info("Starting service");
<<<<<<< HEAD
		Endpoint.publish("http://localhost:2021/webservices/PoductsMAnager", new ProductsManagerImpl());
=======
		Endpoint.publish("http://localhost:2020/webservices/ProductsManager", new ProductsManagerImpl());
>>>>>>> 0e336e677af753603c9c5dc28bec5c0a91209612
		logger.info("Server started");
	}
}
