package com.Error;

class MyCheckedException extends Exception{
	MyCheckedException(String msg){
		super(msg);
	}
}

class MyUncheckedException extends RuntimeException{
	MyUncheckedException(String msg){
		super(msg);
	}
}

public class CustomCheckedUncheckedException {

	public static void main(String[] args) /*throws MyCheckedException*/ {
		if(true)
		throw new MyCheckedException("excepppppppppppppppppppppppppppppppp");
		//uncomment throws to remove the error
		
		throw new MyUncheckedException("uncheckedddddddddddd");
	}

}
