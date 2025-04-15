package com.cms.ds.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			// Trying to modify the list directly while iterating
			if (element.equals("B")) {
				list.remove("B"); // This will cause ConcurrentModificationException on the *next* call to next()
									// or hasNext()
				// list.add("D"); // This would also cause it
			}
		}
	}
}
