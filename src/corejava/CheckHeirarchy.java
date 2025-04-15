package corejava;

class Base {
	Base() {
		System.out.println("Base Class");
	}
}

class Derived extends Base {
	Derived() {
		System.out.println("Derived Class");
	}
}

class DeriDerived extends Derived {
	DeriDerived() {
		System.out.println("DeriDerived Class");
	}
}

public class CheckHeirarchy {
	public static void main(String args[]) {
		DeriDerived dd = new DeriDerived();
	}
}
