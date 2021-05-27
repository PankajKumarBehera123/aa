package com.urbanladder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.urbanladder.dto.ProductDto;
import com.urbanladder.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;

	@RequestMapping("/search-products.htm")
	public String showProductsSearchPage() {
		return "search-products";
	}

	@RequestMapping("/show-searched-products.htm")
	public String doSearchProducts(@RequestParam("productName") String productName, ModelMap modelMap) {
		List<ProductDto> products = productService.getProducts(productName);
		modelMap.addAttribute("products", products);
		return "product-details";
	}
}
