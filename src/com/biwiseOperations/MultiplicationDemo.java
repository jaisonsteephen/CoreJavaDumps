package com.biwiseOperations;

/** Bitwise multiplication example

2*1 ?
0010    
0001
----
0000


3*1 ?
0011
0001
----
0001

*/

public class MultiplicationDemo {
public static void main(String args[]){
	//System.out.println(38&23);
	for(int i=1;i<100;i++){
		if((i & 1)==1){
			System.out.println(i);
		}
	}
}
}

