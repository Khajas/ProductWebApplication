package com.anwar.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.anwar.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {

	Map<Integer, Product> products=new HashMap<>();
	
	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		Product p = new Product();
		p.setId(2);
		p.setDescription("a");
		p.setName("l");
		p.setPrice(11);
		products.put(2, p);
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public void delete(int id) {
		products.remove(id);
	}

}
