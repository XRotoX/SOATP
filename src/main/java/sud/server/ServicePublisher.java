package sud.server;

import javax.xml.ws.Endpoint;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import sud.webservices.ProductsManagerImpl;

public class ServicePublisher {

	private static Logger logger = (Logger) LoggerFactory.getLogger(ServicePublisher.class);
	public static void main(String[] args) {
		
		logger.info("Starting service");
		Endpoint.publish("http://localhost:2021/webservices/PoductsMAnager", new ProductsManagerImpl());
		logger.info("Server started");
	}
}
