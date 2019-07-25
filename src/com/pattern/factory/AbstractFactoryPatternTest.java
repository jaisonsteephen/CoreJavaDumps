package com.pattern.factory;

public class AbstractFactoryPatternTest {
	public static void main(String args[]) {
		// get color factory
		AbstractFactory abstractFactory1 = FactoryGenerator.getFactory("Shape");

		Shape shape1 = abstractFactory1.getShape("Circle");
		shape1.drawShape();

		Shape shape3 = abstractFactory1.getShape("Square");
		shape3.drawShape();

		AbstractFactory colorFactory = FactoryGenerator.getFactory("Color");

		Color color2 = colorFactory.getColor("Green");
		color2.fillColor();

		Color color3 = colorFactory.getColor("Blue");
		color3.fillColor();
	}
}
