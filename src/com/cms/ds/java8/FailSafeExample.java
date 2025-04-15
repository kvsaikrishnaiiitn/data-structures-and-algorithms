package com.cms.ds.java8;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator(); // Iterator operates on a snapshot taken here

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("Iterating: " + element);
			if (element.equals("B")) {
				// Modifying the original list. This creates a new underlying array.
				// The iterator continues on the OLD snapshot/array.
				list.add("D");
				list.remove("C");
			}
		}

		System.out.println("Iteration finished.");
		System.out.println("Final list: " + list);
	}
}
