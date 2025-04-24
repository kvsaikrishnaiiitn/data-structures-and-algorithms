package com.cms.designpatterns;

//1. Interface for the objects to be created
interface Shape {
	void draw();
}

//2. Concrete classes implementing the Shape interface
class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

//3. Factory class to create Shape objects
class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null || shapeType.isEmpty()) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null; // Or throw an IllegalArgumentException for invalid type
	}
}

//4. Client code using the Factory
public class FactoryDesignPatternExample {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// Get a Circle object
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw(); // Output: Drawing a Circle

		// Get a Rectangle object
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw(); // Output: Drawing a Rectangle

		// Get a Square object
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw(); // Output: Drawing a Square

		// Get an object for an invalid type
		Shape unknownShape = shapeFactory.getShape("TRIANGLE");
		if (unknownShape == null) {
			System.out.println("Unknown shape type"); // Output: Unknown shape type
		}
	}
}
