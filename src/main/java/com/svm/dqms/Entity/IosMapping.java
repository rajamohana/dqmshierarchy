package com.svm.dqms.Entity;

public class IosMapping {

	private String channelId;
	private String standard;
	private String category;
	private String subcategory;
	private String contents;
	private String positions;
	private String item;
	private String suffix;
	private String status;

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getStandard() {
		return standard;
	}

	public String getChannelId() {
		return channelId;
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

	public String getPositions() {
		return positions;
	}

	public void setPositions(String positions) {
		this.positions = positions;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public IosMapping() {
		super();
	}

	public IosMapping(String channelId, String standard, String category, String subcategory, String contents,
			String positions, String item, String suffix, String status) {
		super();
		this.channelId = channelId;
		this.standard = standard;
		this.category = category;
		this.subcategory = subcategory;
		this.contents = contents;
		this.positions = positions;
		this.item = item;
		this.suffix = suffix;
		this.status = status;
	}

}
