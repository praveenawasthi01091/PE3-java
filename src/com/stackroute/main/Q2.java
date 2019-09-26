package com.stackroute.main;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int noOfRows,noOfColumns;
		Scanner sc =new Scanner(System.in);
		try
		{
		 System.out.print("Input number of rows of matrix:");
		 noOfRows =sc.nextInt();
		 System.out.print("Input number of columns of matrix:");
		 noOfColumns=sc.nextInt();
		 //  call method
		 sumOf2Matrices(noOfRows,noOfColumns );
		 sc.close();
		}
		catch(Exception e)
		{
			System.out.println("Enter only integer");
		}
	}
	
	public static void sumOf2Matrices(int noOfRows, int noOfColumns)
	{
		//System.out.println(noOfRows+" "+ noOfColumns);
		int matrix1[][]=new int[noOfRows][noOfColumns];
		int matrix2[][]=new int[noOfRows][noOfColumns];
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.print("Input elements of first matrix:");
			for(int i=0;i<noOfRows;i++)
			{
				for(int j=0;j< noOfColumns;j++)
				{
					matrix1[i][j]=sc.nextInt();
				}
			}
			System.out.print("Input elements of second matrix:");
			for(int i=0;i<noOfRows;i++)
			{
				for(int j=0;j< noOfColumns;j++)
				{
					matrix2[i][j]=sc.nextInt();
				}
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println("Enter only integer");
			System.exit(0);
		}
		
		/* calculate and print sum of two matrices */
		System.out.println("Sum of the matrices:-");
		for(int i=0;i<noOfRows;i++)
		{
		
			for(int j=0;j< noOfColumns;j++)
			{
				System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
			}
			//System.out.println();
		}
		
	}

}
