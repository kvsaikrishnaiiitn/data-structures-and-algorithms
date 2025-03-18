package com.cms.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OddOneOut {

	public static void main(String[] args) {
		// List<String> series = Arrays.asList("ACB", "DEF", "BDC", "CED");
		// List<String> series = Arrays.asList("adc", "wzy", "abc");
		String[] series = { "adc", "wzy", "abc" };
		String oddOneOut = oddString(series);
		System.out.println("Odd One Out: " + oddOneOut);
	}

	public static String oddString(String[] words) {
		var d = new HashMap<String, List<String>>();
		for (var s : words) {
			int m = s.length();
			var cs = new char[m - 1];
			for (int i = 0; i < m - 1; ++i) {
				cs[i] = (char) (s.charAt(i + 1) - s.charAt(i));
			}
			var t = String.valueOf(cs);
			d.putIfAbsent(t, new ArrayList<>());
			d.get(t).add(s);
		}
		System.out.println("OddOneOut.oddString()...d:" + d);
		for (var ss : d.values()) {
			if (ss.size() == 1) {
				return ss.get(0);
			}
		}
		return "";
	}
}