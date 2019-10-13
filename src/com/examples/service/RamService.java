package com.examples.service;

import java.util.List;

import com.examples.model.HardDisk;
import com.examples.model.Ram;

public interface RamService {
	void createRam();
	void removeRam();
	HardDisk getRam(String comapany);
    List<Ram> getRams();

}
