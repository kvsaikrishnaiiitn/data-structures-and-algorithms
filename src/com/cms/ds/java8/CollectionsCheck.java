package com.cms.ds.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsCheck {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element.equals("B")) {
				// This line will cause ConcurrentModificationException
				list.remove(element);
			}
		}

		System.out.println("list:" + list);
	}

}
