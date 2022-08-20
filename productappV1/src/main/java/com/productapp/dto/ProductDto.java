package com.productapp.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
public class ProductDto {
	
	private Integer id;
	private String name;
	private BigDecimal price;
	
	@NotNull(message = "{productDto.name.absent}")
	@Pattern(regexp = "(\\s)*[A-Za-z]+((\\s)?((\\'|\\-|\\.)?([A-Za-z])+))*(\\s)*", message = "{productDto.name.invalid}")
	
	
	@NotNull(message = "{productDto.price.absent}")
	@Range(min = 10, max = 100000, message = "{productDto.price.invalid}")
	

	public ProductDto() {
	}

	public ProductDto(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
