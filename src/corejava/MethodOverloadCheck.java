package corejava;

public class MethodOverloadCheck {
	void check(Object o) {
		System.out.println("Object o");
	}

	void check(String o) {
		System.out.println("String o");
	}

	void check3(StringBuilder o) {
		System.out.println("StringBuilder o");
	}

	public static void main(String[] args) {
		MethodOverloadCheck methodOverloadCheck = new MethodOverloadCheck();
		methodOverloadCheck.check(null);
	}
}
