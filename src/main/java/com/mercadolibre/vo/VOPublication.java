package com.mercadolibre.vo;

public class VOPublication {

	private String id;
	private String title;
	private String categoryId;
	private String name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString () {
		StringBuilder str = new StringBuilder ();
		str.append("ID = ").append(this.id);
		str.append("\n");
		str.append(" Title = ").append(this.title);
		str.append("\n");
		str.append(" Category ID = ").append(this.categoryId);
		str.append("\n");
		str.append(" Category name = ").append(this.name).append(";");
		str.append("\n");
		return str.toString();
	}
	
}
