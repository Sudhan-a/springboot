package com.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Grocery {

@Id
private int sno;
private String product;
private int prize;
private int quantity;
private int total;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getPrize() {
	return prize;
}
public void setPrize(int prize) {
	this.prize = prize;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}

}