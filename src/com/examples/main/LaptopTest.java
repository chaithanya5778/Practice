package com.examples.main;

import java.util.ArrayList;
import java.util.List;

import com.examples.model.HardDisk;
import com.examples.model.Laptop;
import com.examples.model.Ram;
import com.examples.service.RamService;
import com.examples.serviceImpl.HadDiskServiceImpl;
import com.examples.serviceImpl.RamServiceImpl;

public class LaptopTest {

	public static void main(String[] args) {
		Laptop lp = new Laptop();
		Laptop lp2 = new Laptop();

		lp.setName("Hp");
		lp2.setName("Dell");

		List<Laptop> lps = new ArrayList<Laptop>();
		lps.add(lp);
		lps.add(lp2);

		List<HardDisk> hds =  HadDiskServiceImpl.getHds();
		

		RamService ramService = new RamServiceImpl();
		List<Ram> rams = ramService.getRams();

		for (Laptop lap : lps) {

			for (HardDisk hd : hds) {
				lap.setHardDisk(hd);

			}

			for (Ram ram : rams) {
				lap.setRam(ram);

			}

		}

		lps.add(lp);
		lps.add(lp2);

		System.out.println(lps);

	}

}
