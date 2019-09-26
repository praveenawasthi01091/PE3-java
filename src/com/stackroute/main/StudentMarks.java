package com.stackroute.main;
import java.util.*;

public class StudentMarks {
	public static void main(String[] args)
	{
	   Scanner sc= new Scanner(System.in);
	   System.out.print("Enter the number of students: ");
	   // try  to check for no of students
	   try 
	   {
		   int noOfStudents=sc.nextInt();
		   int marksArray[]=new int[noOfStudents];
		   int val;
		   for(int i=0;i<noOfStudents;i++)
		   {
			   System.out.print("Enter the grade ofstudent "+(i+1)+": ");
			   // try to validate grades of each students
			   try 
			   {
			   val=sc.nextInt();
			   if(val<0 || val >100)
			   {
				   System.out.println("Error Please  provide  valid marks");
				   System.exit(0);
			   }
			   marksArray[i]=val;
			   }
			   
			   catch(Exception e)
			   {
				   System.out.println("Please provide valid input");
				   System.exit(0);
			   }
		   }
		   System.out.println("All grades saved successfully!!!");

	   }
	   
	   catch (Exception e)
	   {
		   System.out.println("Please provide valid input");
	   }
	   sc.close();
	   
	}	

}
