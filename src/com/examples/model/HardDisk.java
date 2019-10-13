

//
package com.examples.model;

public class HardDisk {
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
		return "HardDisk [company=" + company + ", size=" + size + "]";
	}
	
	

}
