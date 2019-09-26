package com.stackroute.main;

public class Q7 {

	public static void main(String[] args)
	{
	    try
	    {
	    	int i=5;
	    	if(i>0)
	    		throw new Exception("Error ;(");
	    }
	    catch (Exception e)
	    {
	    	System.out.println(e);
	    }
	    finally {
			System.out.println("Final block");
		}
	}

}
