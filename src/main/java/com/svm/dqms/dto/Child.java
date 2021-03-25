package com.svm.dqms.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
public class Child {

	private String name;

	@JsonProperty("category")
	private List<Category> category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("category")
	public List<Category> getChildren() {
		return category;
	}

	@JsonProperty("category")
	public void setChildren(List<Category> category) {
		this.category = category;
	}

	public Child(String name, List<Category> category) {
		super();
		this.name = name;
		this.category = category;
	}

	public Child() {
		super();
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", category=" + category + "]";
	}

}
