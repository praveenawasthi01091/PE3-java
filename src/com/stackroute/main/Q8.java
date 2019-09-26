package com.stackroute.main;
import java.util.*;

public class Q8 {

	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter no between 1 to 3:");
		int value=sc.nextInt();
		sc.close();
		try
		{
			if(value==1)
			{
				Integer val=null;
				int arr[]=new  int[val];
			}
			if(value ==2)
			{
				int arr[]=new  int[3 ];
				System.out.println(arr[-2]);
			}
			if(value==3)
			{
				int arr[]=new  int[-3 ];
				System.out.println(arr[2]);
			}
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(e);
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
