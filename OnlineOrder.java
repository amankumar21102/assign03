package com.elemica.supply.chain.assign01;



public class OnlineOrder extends Order {
	
	
	
	//@Override
	public double calculateOrderValue() {
		return (product.getPrice()*quantityOrdered)+500;
	}
}