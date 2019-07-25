package com.pattern.factory;

public class ColorFactory extends AbstractFactory {
	// getColor method returns object of input type color
	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("Green")) {
			return new Color_Green();

		} else if (color.equalsIgnoreCase("Blue")) {
			return new Color_Blue();
		}

		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}
}
