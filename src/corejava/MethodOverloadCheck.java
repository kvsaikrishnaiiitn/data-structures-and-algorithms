package corejava;

public class MethodOverloadCheck {
	void check(Object o) {
		System.out.println("Object o");
	}

	void check(String o) {
		System.out.println("String o");
	}
	
	public static void main(String[] args) {
		MethodOverloadCheck methodOverloadCheck = new MethodOverloadCheck();
		methodOverloadCheck.check(null);
	}
}
