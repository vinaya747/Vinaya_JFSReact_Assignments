package com.vksk;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	 
	@Autowired
	ProductRepository repo;
    List <Product> list;
	
	public ProductService() {
	}
	
	
	public List<Product> getProducts() {
		return repo.findAll();
	}


	public Optional<Product> getProduct(int id) {
		return repo.findById(id);
	}


	public Product addProduct(Product product) {
		return repo.insert(product); 
	}

	
	public Product updateProduct(Product product) {
		return repo.save(product);
	}


	public void deleteProduct(int id) {
		repo.deleteById(id);
	}	
	

}
