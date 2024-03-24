package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;
	
	public double getprice() {
		return price;
		
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub 
		//init
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		
	}

}