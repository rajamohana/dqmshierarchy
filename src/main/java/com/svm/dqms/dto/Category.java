package com.svm.dqms.dto;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
public class Category {

	private String name;
	@JsonProperty("subcategory")
	private List<Subcategory> subcategory;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("subcategory")
	public List<Subcategory> getChildren() {
		return subcategory;
	}

	@JsonProperty("subcategory")
	public void setChildren(List<Subcategory> subcategory) {
		this.subcategory = subcategory;
	}
	public Category(String name, List<Subcategory> subcategory) {
		super();
		this.name = name;
		this.subcategory = subcategory;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", subcategory=" + subcategory + "]";
	}

}
