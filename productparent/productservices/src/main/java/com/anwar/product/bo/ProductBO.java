package com.anwar.product.bo;

import com.anwar.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	public Product findProduct(int id);
}
