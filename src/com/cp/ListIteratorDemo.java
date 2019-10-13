package com.cp;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("chaithu");
		l.add("ravi");
		l.add("nageswara");
		l.add("vijay");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()) {
			String s=(String)ltr.next();
			if(s.contentEquals("vijay")) {
				ltr.remove();
			}
			else if(s.equals("chaithu")){
				ltr.set("siddharth");
			}
			else if(s.equals("ravi")){
				ltr.add("manu");
			}
		}
			System.out.println(l);
		
		

	}

}
