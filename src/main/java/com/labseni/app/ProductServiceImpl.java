package com.labseni.app.service.impl;

/*
	Filename : ProyekServiceImpl.java
*/

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.labseni.app.domain.Product;
import com.labseni.app.domain.repository.ProductRepository;
import com.labseni.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	public void updateAllStock(){
		List<Product> allProducts=productRepository.getAllProducts();
		for(Product product:allProduct)
		{
			if (product.getUnitsInStock()<500)
				productRepository.updateStock(getProductId(), product.getUnitsInStock()+1000);
		}
	}
}