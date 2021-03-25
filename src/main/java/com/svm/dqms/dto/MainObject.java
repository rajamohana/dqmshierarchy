package com.svm.dqms.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainObject {

	private String name;
	@JsonProperty("child")
	private List<Child> child;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("child")
	public List<Child> getChildren() {
		return  child;
	}

	@JsonProperty("child")
	public void setChildren(List<Child> child) {
		this.child = child;
	}

	public MainObject(String name, List<Child> child) {
		super();
		this.name = name;
		this.child = child;
	}

	public MainObject() {
		super();
	}

	@Override
	public String toString() {
		return "MainObject [name=" + name + ", child=" + child + "]";
	}
}
