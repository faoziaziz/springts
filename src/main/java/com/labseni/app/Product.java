package com.labseni.app.domain;

/*
	filename : Product.java
*/

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable{
	private static final long serialVersionUID = 3678107792576131001L;
	private String productId;
	private String name;
	private BigDecimal unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private long unitsInOrder;
	private boolean discontinued;
	private String condition;
	
	public Product() {
		super();
	}
	
	public Product(String productId, String name, BigDecimal unitPrice)
	{
		this.productId=productId;
		this.name=name;
		this.unitPrice=unitPrice;
	}
	public void setDescription(String description)
	{
		this.description=description;
		//return this;
	}
	public void setCategory(String category)
	{
		this.category=category;
		//return this;
	}
	public void setManufaktur(String manufaktur)
	{
		this.manufacturer=manufacturer;
		//return this;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}

		if (obj==null){
			return false;
		}

		if(getClass()!=obj.getClass()){
			return false;
		}

		Product other = (Product) obj;
		if (productId==null){
			if (other.productId!=null)
			{
				return false;
			}
		}
		else if(!productId.equals(other.productId))
		{
			return false;
		}
		return true;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result=1;
		result=prime*result +((productId==null)?0:productId.hashCode());
		return result;
	}
}