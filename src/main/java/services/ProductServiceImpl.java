package services;

import domain.Product;
import repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Iterable<Product> listAllProducts() {

		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer Id) {

		return productRepository.findById(Id).orElse(null);
	}

	@Override
	public Product saveProduct(Product product) {

		return productRepository.save(product);
	}

}
