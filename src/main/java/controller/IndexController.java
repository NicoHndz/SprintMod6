package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// se debe indicar que la clase es un controlador

@Controller
public class IndexController {
	@RequestMapping("/")
	String index() {
		return "index";
	}
}
