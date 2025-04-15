package corejava;

class Parent {
	public void display() {
		System.out.println("Display from Parent class");
	}

	public static void show() {
		System.out.println("Static show method from Parent class");
	}
}

class Child extends Parent {
	// This method hides the display() method of the Parent class
	public void display() {
		System.out.println("Display from Child class");
	}

	// This static method hides the static show() method of the Parent class
	public static void show() {
		System.out.println("Static show method from Child class");
	}
}

public class MethodHidingExample {
	public static void main(String[] args) {
		Child childObj = new Child();
		Parent parentObj = new Parent();
		Parent parentRef = new Child(); // Reference of Parent type pointing to Child object

		System.out.println("--- Calling methods through Child object ---");
		childObj.display(); // Calls Child's display()
		childObj.show(); // Calls Child's static show()

		System.out.println("\n--- Calling methods through Parent object ---");
		parentObj.display(); // Calls Parent's display()
		parentObj.show(); // Calls Parent's static show()

		System.out.println("\n--- Calling methods through Parent reference pointing to Child object ---");
		parentRef.display(); // Calls Parent's display() - This demonstrates that instance method hiding in
								// Java doesn't behave polymorphically like overriding.
		parentRef.show(); // Calls Parent's static show() - Static methods are associated with the class,
							// not the object.
	}
}