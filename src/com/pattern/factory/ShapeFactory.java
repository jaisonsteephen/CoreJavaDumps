package com.pattern.factory;

public class ShapeFactory extends AbstractFactory {

	// getShape method returns object of input type shape
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Shape_Circle();

		} 
		else if (shapeType.equalsIgnoreCase("Square")) {
			return new Shape_Square();
		}

		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
}
