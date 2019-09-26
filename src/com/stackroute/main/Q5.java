package com.stackroute.main;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[][]=new String[8][8];
		int statusOfRow=0;
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j=j+2)
			{
				if(statusOfRow==0)
				{
					
					arr[i][j]="WW|";
					arr[i][j+1]="BB|";
				}
				else
				{
					arr[i][j]="BB|";
					arr[i][j+1]="WW|";
				}
			}
			statusOfRow=Math.abs(statusOfRow-1);
		}
		
		/* print results */
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
