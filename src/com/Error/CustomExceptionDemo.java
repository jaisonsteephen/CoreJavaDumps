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

public class CustomExceptionDemo {

	public static void main(String[] args) throws MyCheckedException {
		//throw new MyCheckedException("excepppppppppppppppppppppppppppppppp");
		throw new MyUncheckedException("uncheckedddddddddddd");
	}

}
