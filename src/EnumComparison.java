/**
 * 
 * @author jaison
 * 
 * equals() method of Java.lang.Enum internally uses == to compare enum in Java
 * If you are not just checking whether two enum are equal or not, and rather interested in order of different instance of Enum, 
 * then you can use compareTo() method
 * 
 * output
 * ---------
 * -1
 * false
 * false
 *
 */
enum MyEnum {
	INSTANCE,INSTANCE2;
	MyEnum(){
	}
}
public class EnumComparison {
	public static void main(String args[]) {
		MyEnum enum1=MyEnum.INSTANCE;
		MyEnum enum2=MyEnum.INSTANCE2;		
		
		System.out.println(enum1.compareTo(enum2));
		System.out.println(enum1.equals(enum2));
		System.out.println(enum1==enum2);
	}
}