package com.urbanladder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.urbanladder.dto.ProductDto;
import com.urbanladder.repositories.ProductRepository;

//@Service
public class ProductService {
//	@Autowired
	ProductRepository productRepository;

//	@Transactional(readOnly = true)
	public List<ProductDto> getProducts(String productName) {
		List<ProductDto> productDtos = new ArrayList<ProductDto>();
		productRepository.findProductsByProductNameLike("%" + productName + "%", Sort.by("productName"))
				.forEach(product -> {
					ProductDto productDto = new ProductDto();
					BeanUtils.copyProperties(product, productDto);
					productDtos.add(productDto);
				});
		return productDtos;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

}
