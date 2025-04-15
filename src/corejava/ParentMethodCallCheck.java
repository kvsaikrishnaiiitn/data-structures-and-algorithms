package corejava;

class ParentClass {
	void method1() {
		System.out.println("ParentClass.method1()");
	}
}

class ChildClass extends ParentClass {
	void method1() {
		System.out.println("ChildClass.method1()");
	}

	void callParentMethod1() {
		super.method1();
	}
}

public class ParentMethodCallCheck {
	public static void main(String[] args) {
		ParentClass parentRef = new ChildClass();
		parentRef.method1();

		ChildClass childClass = new ChildClass();
		childClass.callParentMethod1();

	}
}
