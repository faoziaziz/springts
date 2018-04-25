package com.labseni.app.domain.repository;

import java.util.List;
import com.labseni.app.domain.Product;

public interface ProductRepository{
	List <Product> getAllProducts();
}