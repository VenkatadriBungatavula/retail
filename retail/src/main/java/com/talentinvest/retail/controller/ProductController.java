package com.talentinvest.retail.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.talentinvest.retail.model.Employee;
import com.talentinvest.retail.model.Product;
import com.talentinvest.retail.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	static ArrayList<Product> productList = new ArrayList<>();

	@RequestMapping("/product")
	public ModelAndView productPage() {
		ModelAndView mav = new ModelAndView();

//		 Product p1 = new Product(1,"Biscuits",7000);
//	     Product p2 = new Product(2,"Choclates",8000);
//		 Product p3 = new Product(3,"Bakery",1300);
//		 Product p4 = new Product(4,"Chips",7000);
//		 Product p5 = new Product(5,"cooldrinks",12000);
//		 Product p6 = new Product(6,"icecreams",11000);

//		 ProductList.add(p1);
//		 ProductList.add(p2);
//		 ProductList.add(p3);
//		 ProductList.add(p4);
//		 ProductList.add(p5);

		List<Product> productList = productService.getAllProduct();
		mav.setViewName("product");
		mav.addObject(productList);

		return mav;

	}

	@RequestMapping("/createProduct")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("createProduct");
		return mav;
	}
	
	   @RequestMapping("/deleteProduct/{pID}")
	   public ModelAndView deleteEmployee(@PathVariable("pID") int pID) {
		   ModelAndView mav = new ModelAndView();
		   productService.deleteEmployee(pID);
		   List<Product> productList = productService.getAllProduct();
		   mav.setViewName("product");
		   mav.addObject(productList);
		   return mav;
		   
		   
	   }	

}
