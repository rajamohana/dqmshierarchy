package com.svm.dqms.model;

public class HierarchyModel {
	
	public String channel_id;
	public String standard;
	public String category;
	public String subcategory;
	public String contents;
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return "HierarchyModel [channel_id=" + channel_id + ", standard=" + standard + ", category=" + category
				+ ", subcategory=" + subcategory + ", contents=" + contents + "]";
	}
	
	

}
