package com.examples.service;

import java.util.List;

import com.examples.model.HardDisk;

public interface HardDiskService {
	void createHd();
	void removeHd();
	HardDisk getHd(String comapany);
    //List<HardDisk> getHds();
}
