package com.anwar.product.bo;

import com.anwar.product.dao.ProductDAO;
import com.anwar.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private ProductDAO dao;
	
	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
