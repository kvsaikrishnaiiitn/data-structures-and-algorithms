package com.cms.ds.java8;

public class Java8InterfacesCheck {
	public static void main(String[] args) {
		I1.staticMethod1();
		I2.staticMethod1();

		Implementation1 implementation1 = new Implementation1();
		implementation1.defaultMethod1();
		implementation1.method1();

	}
}

class Implementation1 implements I1, I2 {
	void method1() {
		System.out.println("Implementation1.method1()");
	}

	@Override
	public void defaultMethod1() {
		I1.super.defaultMethod1();
	}
}

interface I1 {
	default void defaultMethod1() {
		System.out.println("I1.defaultMethod1()");
	}

	static void staticMethod1() {
		System.out.println("I1.staticMethod1()");
	}
}

interface I2 {
	default void defaultMethod1() {
		System.out.println("I2.defaultMethod1()");
	}

	static void staticMethod1() {
		System.out.println("I2.staticMethod1()");
	}
}
