package com.cp;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			Employee emp=new Employee();
			emp.setId(i);
			emp.setName("aaa"+i);
			al.add(emp);
		}
		System.out.println(al);
		
	}

}
