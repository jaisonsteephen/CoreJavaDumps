package com.pattern;
interface Colour{
	public void fill(String colour);
}
interface Shape{
	public void draw(String shape);
}
class ConcreteColour implements Colour{

	@Override
	public void fill(String colour) {
		System.out.println(colour);
	}
}
class ConcreteShape implements Shape{

	@Override
	public void draw(String shape) {
		System.out.println(shape);
	}
	
}
abstract class AbstractFactory{
abstract public Colour getcolour(String colour);
abstract public Shape getShape(String shape); 
}

class ColorFactory extends AbstractFactory{

	@Override
	public Colour getcolour(String colour) {
		if(colour=="Red")
		return new ConcreteColour();
		else return new ConcreteColour();
		
	}

	@Override
	public Shape getShape(String shape) {
		return null;
		
	}
	
}
public class AbstractFactoryDemo {

}
