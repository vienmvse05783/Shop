package com.vienmv.model;

import java.io.Serializable;

public class ProductModel implements Serializable {
	int pro_id;
	String pro_name;
	double origin_price;
	double sale_price;
	int quantity;
	int cate_id;
	String pro_size;
	String pro_dec;
	public ProductModel() {
		super();
	}
	public ProductModel(int pro_id, String pro_name, double origin_price, double sale_price, int quantity, int cate_id,
			String pro_size, String pro_dec) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.origin_price = origin_price;
		this.sale_price = sale_price;
		this.quantity = quantity;
		this.cate_id = cate_id;
		this.pro_size = pro_size;
		this.pro_dec = pro_dec;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public double getOrigin_price() {
		return origin_price;
	}
	public void setOrigin_price(double origin_price) {
		this.origin_price = origin_price;
	}
	public double getSale_price() {
		return sale_price;
	}
	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCate_id() {
		return cate_id;
	}
	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}
	public String getPro_size() {
		return pro_size;
	}
	public void setPro_size(String pro_size) {
		this.pro_size = pro_size;
	}
	public String getPro_dec() {
		return pro_dec;
	}
	public void setPro_dec(String pro_dec) {
		this.pro_dec = pro_dec;
	}
	

}
