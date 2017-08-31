
public class FinallyDemo {
public static void main(String args[]){
	System.out.println(fun());
}

public static int fun(){
	try{
		return 1;
	}
	finally{
		return 2;//Output will be 2
	}
}
}
