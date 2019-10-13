package com.examples.model;

public class Laptop {
	private String name;
	private HardDisk hardDisk;
	private Ram ram;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HardDisk getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", hardDisk=" + hardDisk + ", ram=" + ram + "]";
	}
	
	

}
