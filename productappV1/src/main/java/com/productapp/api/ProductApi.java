package com.productapp.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.dto.ProductDto;
import com.productapp.repository.Product;
import com.productapp.service.ProductService;

@RestController
public class ProductApi {

	private ProductService productService;

	@Autowired
	public ProductApi(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping(path = "products")
	public List<Product>findAll(){
		return productService.findAll();
	}
	
	@GetMapping(path = "products/{id}")
	public Product findById(@PathVariable(name = "id") int id){
		return productService.getById(id);
	}
	
	@PostMapping(path = "products")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody ProductDto productDto){
		
		Product product = convertProductDtotoProduct(productDto);
		Product savedProduct = productService.addProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
	}
	
	private Product convertProductDtotoProduct(ProductDto productDto) {
		Product product = new Product();
		product.setId(productDto.getId());
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		
		return product;
	}

	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	@DeleteMapping(path = "products/{id}")
	public void deleteProduct(@PathVariable(name = "id") int id){
		 productService.deleteProduct(id);
	}
	
	@PutMapping(path = "products/{id}")
	public Product updateProduct(@PathVariable(name = "id") int id, @RequestBody Product product){
		return productService.updateProduct(id, product);
	}
}
