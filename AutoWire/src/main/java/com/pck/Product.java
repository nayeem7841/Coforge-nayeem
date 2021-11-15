package com.pck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("product")
public class Product 
{
	private Cart cart;
	private Items items;
	@Autowired
	Product(Cart cart)
	{
		this.cart=cart;
	}
	@Value("what is the things")
	private String name;
   public void total_product()
   {
	   System.out.println("total we have 50 items");
   }
    public String getName()
    {
	return name;
    }
    public void setName(String name) 
    {
	  this.name = name;
    }
    
    @Autowired
    public void myfunc(Items items)
    {
    	this.items=items;
    }
    
   public Items getMyfunc()
   {
	   return items;
   }
}
