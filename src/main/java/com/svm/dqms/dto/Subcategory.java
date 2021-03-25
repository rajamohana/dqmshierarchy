package com.svm.dqms.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subcategory {

	private String name;
	
	@JsonProperty("children")
	private List<Children> children;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("children")
	public List<Children> getChildren() {
		return children;
	}

	@JsonProperty("children")
	public void setChildren(List<Children> children) {
		this.children = children;
	}

	public Subcategory(String name, List<Children> children) {
		super();
		this.name = name;
		this.children = children;
	}

	public Subcategory() {
		super();
	}

	@Override
	public String toString() {
		return "Subcategory [name=" + name + ", children=" + children + "]";
	}

}
