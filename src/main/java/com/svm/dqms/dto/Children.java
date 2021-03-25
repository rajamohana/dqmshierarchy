package com.svm.dqms.dto;

public class Children {

	private long channelId;
	private String name;
	private String contents;
	private String positions;
	private String item;
	private String suffix;
	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public long getChannelId() {
		return channelId;
	}

	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}

	public Children(long channelId, String name, String contents, String positions, String item, String suffix,
			String status) {
		super();
		this.channelId = channelId;
		this.name = name;
		this.contents = contents;
		this.positions = positions;
		this.item = item;
		this.suffix = suffix;
		this.status = status;
	}

	public Children() {
		super();
	}

	@Override
	public String toString() {
		return "Children [channelId=" + channelId + ", name=" + name + ", contents=" + contents + ", positions="
				+ positions + ", item=" + item + ", suffix=" + suffix + ", status=" + status + "]";
	}

	
	
}
