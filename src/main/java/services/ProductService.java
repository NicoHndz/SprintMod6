package services;

import domain.Product;

//querys
public interface ProductService {
	Iterable<Product> listAllProducts();

	Product getProductById(Integer Id);

	Product saveProduct(Product product);
}
