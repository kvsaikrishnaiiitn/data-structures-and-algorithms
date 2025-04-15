package corejava;

abstract class Animal {
	static void eat() {
		System.out.println("eating…");
	}
}

class Cat extends Animal {
	void eat2() {
		System.out.println("cat is eating…");
	}
}

public class AbstractStaticTest {
	public static void main(String[] args) {
		Animal.eat();
		Animal cat = new Cat();
		cat.eat();
	}
}
