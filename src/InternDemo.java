
public class InternDemo {

	public static void main(String args[]) {
		String str;
		String str2 = new String("str2");
		String str3;
		str3 = str2.intern();
		System.out.println(str3);
	}
}
