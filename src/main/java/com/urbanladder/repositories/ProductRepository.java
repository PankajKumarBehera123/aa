package com.urbanladder.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbanladder.entities.Product;

//@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	public List<Product> findProductsByProductNameLike(String productName, Sort sort);
}
