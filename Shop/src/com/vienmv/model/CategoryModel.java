package com.vienmv.model;

import java.io.Serializable;

public class CategoryModel implements Serializable {
	int cate_id;
	String cate_name;
	public CategoryModel() {
		super();
	}
	public CategoryModel(int cate_id, String cate_name) {
		super();
		this.cate_id = cate_id;
		this.cate_name = cate_name;
	}
	public int getCate_id() {
		return cate_id;
	}
	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}
	public String getCate_name() {
		return cate_name;
	}
	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}
	

}
