package com.Error;


class CustomException extends Exception
{

    private static final long serialVersionUID = 1997753363232807009L;

		public CustomException()
		{
		}

		public CustomException(String message)
		{
			super(message);
		}

		public CustomException(Throwable cause)
		{
			super(cause);
		}

		public CustomException(String message, Throwable cause)
		{
			super(message, cause);
		}

		public CustomException(String message, Throwable cause, 
                                           boolean enableSuppression, boolean writableStackTrace)
		{
			super(message, cause, enableSuppression, writableStackTrace);
		}

}

public class CustomCheckedExceptionDemo
{
    public static void main(String[] args)
    {
	try
        {
	      testException(null);
        }
        catch (CustomException e)
        {
	      e.printStackTrace();
        }
    }
		
    public static void testException(String string) throws CustomException
    {
	      if(string == null)
		    throw new CustomException("The String value is null");
    }
}