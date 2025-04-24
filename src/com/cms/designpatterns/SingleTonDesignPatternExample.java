package com.cms.designpatterns;

public class SingleTonDesignPatternExample {

	private SingleTonDesignPatternExample() {
	}

	private static class SingleTonHolder {
		private static final SingleTonDesignPatternExample INSTANCE = new SingleTonDesignPatternExample();
	}

	public static SingleTonDesignPatternExample getInstance() {
		return SingleTonHolder.INSTANCE;
	}

}
