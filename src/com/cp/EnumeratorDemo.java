package com.cp;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Integer i1=(Integer)e.nextElement();
			if(i1%2==0)
			System.out.println(i1);
		}
		System.out.println(v);

	}

}
