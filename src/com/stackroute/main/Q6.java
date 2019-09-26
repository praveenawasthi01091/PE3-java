package com.stackroute.main;
import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String inputString;
        Scanner sc=new Scanner(System.in);
        inputString=sc.nextLine();
        sc.close();
        String arr[]=inputString.split(",");
        if(arr.length!=7)
        {
        	System.out.println("Please Provide 7 nos");
        	System.exit(0);
        }
        int arrOfInteger[]=new int[7];
        for(int i=0;i<7;i++)
        {
        	arrOfInteger[i]=Integer.parseInt(arr[i]);
        }
        /* sort given  integer array*/
        Arrays.sort(arrOfInteger);
        int flag=0;
        for(int i=1;i<7;i++)
        {
        	if(arrOfInteger[i]-arrOfInteger[i-1]==1)
        	{
        		continue;
        	}
        	else
        	{
        		flag=1;
        		break;
        	}
        }
        
        System.out.print(inputString);
        if(flag==0)
             System.out.println(" are consecutive numbers");
        else
        	 System.out.println("  non consecutive numbers");	
	}

}
