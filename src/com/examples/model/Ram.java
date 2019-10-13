package com.examples.model;

public class Ram {

	private String company;
	private String size;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Ram [company=" + company + ", size=" + size + "]";
	}
	
	


}
