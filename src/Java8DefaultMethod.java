
public class Java8DefaultMethod {
	interface Calculate {
		public default void add(int a, int b) {
			System.out.println(a + b);
		}
		public void addWrapper();
	}

	public static void main(String args[]) {
		System.out.println("hi");
		Calculate c=new Calculate(){
			@Override
			public void addWrapper() {
				add(3,5);
			}
			
		};
		
		c.addWrapper();
		
	}
	

}
