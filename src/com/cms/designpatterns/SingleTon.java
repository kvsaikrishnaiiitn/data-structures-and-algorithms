package com.cms.designpatterns;

public class SingleTon {

	private SingleTon() {
	}

	private static class SingleTonHolder {
		private static final SingleTon INSTANCE = new SingleTon();
	}

	public static SingleTon getInstance() {
		return SingleTonHolder.INSTANCE;
	}

}
