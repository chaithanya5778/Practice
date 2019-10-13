package com.examples.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.examples.model.HardDisk;
import com.examples.model.Ram;
import com.examples.service.RamService;

public class RamServiceImpl  implements RamService{

	@Override
	public void createRam() {
		
	}

	@Override
	public void removeRam() {
		
	}

	@Override
	public HardDisk getRam(String comapany) {
		return null;
	}

	@Override
	public List<Ram> getRams() {
		
		 Ram r1=new Ram();
	       r1.setCompany("rrrr2");
	       r1.setSize("4GB");
	       
	       Ram r=new Ram();
	       r.setCompany("rrrr");
	       r.setSize("2GB");
	       
	       List<Ram> rams=new ArrayList<Ram>();
	       rams.add(r);
	       rams.add(r1);
	       
		return rams;
	}

}
