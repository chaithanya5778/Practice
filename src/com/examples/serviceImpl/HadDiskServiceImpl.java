package com.examples.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.examples.model.HardDisk;
import com.examples.service.HardDiskService;

public class HadDiskServiceImpl implements HardDiskService {

	@Override
	public void createHd() {

	}

	@Override
	public void removeHd() {

	}

	@Override
	public HardDisk getHd(String comapany) {
		return null;
	}

	//@Override
	public static List<HardDisk> getHds() {
		 HardDisk hd=new HardDisk();
	       hd.setCompany("iii");
	       hd.setSize("1TB");
	       
	       HardDisk hd1=new HardDisk();
	       hd1.setCompany("iii2");
	       hd1.setSize("2TB");
	       
	       List<HardDisk> hds=new ArrayList<HardDisk>();
	       hds.add(hd);
	       hds.add(hd1);
	       
		return hds;
	}

}
