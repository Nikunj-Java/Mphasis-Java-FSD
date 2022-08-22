package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") String id) throws ProductNotFoundException{
		
		if(id.contentEquals("0"))
			throw new ProductNotFoundException("Not valid id");
		else
		    return "product was found";
	}
	

}
