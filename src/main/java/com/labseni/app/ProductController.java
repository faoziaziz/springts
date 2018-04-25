package com.labseni.app.controller;

import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.labseni.app.domain.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/products")
	public String list(Model model){
		/*
		Product MITSpring = new Product("P1234", "MITSpring1s", new BigDecimal(500));
		MITSpring.setDescription("Proyek ini diguanakan untuk memburu MIT di midle end");
		MITSpring.setCategory("WebApp");
		MITSpring.setManufacturer("Labseni");
		model.addAttribute("product", MITSpring);
		*/
		model.addAttribute("products", productRepository.getAllProducts());
		return "products";
	}
	@RequestMapping("/update/stock")
	public String updateStock(Model model)
	{
		productService.updateAllStock();
		return "redirect:/products";
	}


}