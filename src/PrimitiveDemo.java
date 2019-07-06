
public class PrimitiveDemo {
public static void main(String args[]){
	Byte byt=(byte) 512;
	System.out.println(byt);
	System.out.println(byt.SIZE);
	System.out.println(byt.BYTES);
	
	Boolean bool=true;
	//System.out.println(bool.SIZE); //Boolean.size is not defined
	
	float x=2;
	double y=x;
	
	long l=2;
	//short s=l;//can't assign large value to short.... reverse is possible
	
	
		
	float f = 0.27f;
	double d2 =  f;
	double d3 = 0.27d;

	System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(f)));
	System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(d2)));
	System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(d3)));
	
	
	System.out.println(Float.NEGATIVE_INFINITY+Float.POSITIVE_INFINITY+2);
	
	
	
	
	
}
}
