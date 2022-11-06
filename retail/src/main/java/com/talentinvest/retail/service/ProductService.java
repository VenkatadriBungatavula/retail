package com.talentinvest.retail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentinvest.retail.model.Product;
import com.talentinvest.retail.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	public void deleteEmployee(int pID) {
		productRepo.deleteById(pID);
	}
}
