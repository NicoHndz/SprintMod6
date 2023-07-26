package upload;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import domain.Product;
import repositories.ProductRepository;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {
	private ProductRepository productRepository;
	private Logger log = LogManager.getLogger();

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Product shirt = new Product();
		shirt.setDescription("polera");
		shirt.setPrice(new BigDecimal("12.56"));
		shirt.setProductId("12");
		productRepository.save(shirt);
		log.info("SAVED" + shirt.getProductId());
		
		Product hat = new Product();
		shirt.setDescription("hat");
		shirt.setPrice(new BigDecimal("20.10"));
		shirt.setProductId("13");
		productRepository.save(hat);
		log.info("SAVED" + hat.getProductId());
		
		Product gloves = new Product();
		shirt.setDescription("gloves");
		shirt.setPrice(new BigDecimal("10.00"));
		shirt.setProductId("14");
		productRepository.save(gloves);
		log.info("SAVED" + gloves.getProductId());

	}
}
