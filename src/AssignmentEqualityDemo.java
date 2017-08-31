
public class AssignmentEqualityDemo {
public static void main(String args[]){
	Long l=1l;
	Long l2=l;
	l=3l;
	System.out.println(l2);
	
	StringBuffer sb= new StringBuffer("hai");
	StringBuffer sb2=sb;
	sb.append("h");
	System.out.println(sb2);
}
}
