
public class AssignmentEqualityDemo {
public static void main(String args[]){

/**
 * 
 *     "abc"==new String("abc")			:false
 *	   "abc"=new String("abc").intern()	:true
 *     "abc".equals(new String("abc"))	:true
 * 
 * 
 */

String x="abc";
String y=new String("abc");
String z=new String("abc").intern();

System.out.println("\"abc\"==new String(\"abc\")	 :"+Boolean.toString(x==y));
System.out.println("\"abc\"=new String(\"abc\").intern() :"+Boolean.toString(x==z));

System.out.println("\"abc\".equals(new String(\"abc\"))	 :"+ Boolean.toString(x.equals(y)));



}
}
