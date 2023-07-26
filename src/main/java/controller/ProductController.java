package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Product;
import services.ProductService;

@Controller
public class ProductController {

	private ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("products", productService.listAllProducts());
		System.out.println("retorno de producto ok");
		return "products";
	}

	@RequestMapping("products/{id}")
	public String showProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("products", productService.getProductById(id));
		return "productShow";
	}

	@RequestMapping("products/edit/{id}")
	public String editProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("products", productService.getProductById(id));
		return "editProduct";
	}

	@RequestMapping("products/new")
	public String newProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("products", new Product());
		return "newProduct";
	}

	@RequestMapping(value = "product", method = RequestMethod.POST)
	public String saveProduct(Product product) {
		productService.saveProduct(product);

		return "redirect:/product/" + product.getId();
	}
}
