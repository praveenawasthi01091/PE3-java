package com.stackroute.main;
import java.util.*;

public class Q4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//String inputString;
		Scanner sc=new Scanner(System.in);
		
		   List<String>list = new ArrayList<String>();
           String countryName;
           System.out.print("Enter 'exit' to exit .Enter strings: ");
           int i = 0, len, numStrings;
           do {
               countryName = sc.nextLine();
               list.add(countryName);
               i++;
           }while(!countryName.equals("exit"));
           
           String[] countriesArray = list.toArray(new String[0]);
           numStrings = i - 1;
           for(i = 0;i < numStrings;i++) 
           {
               len = countriesArray[i].length();
               StringBuilder country = new StringBuilder(countriesArray[i]);
               for(int j = 1;j < len;j++) 
               {
                   if(country.charAt(j) == 'a' || country.charAt(j) == 'e' || country.charAt(j) == 'i'
                           || country.charAt(j) == 'o' || country.charAt(j) == 'u') 
                   {
                           country.deleteCharAt(j);
                           len--;
                           if(j == len - 1) 
                           {
                               j = 1;
                           }
                   }
               }
               System.out.println(country);
           }
}    }
	
/*	public static String [] removeVowels(String inputString)
	{
		String [] arr=inputString.split("\\s");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i].replace("a", "");
			arr[i]=arr[i].replace("e", "");
			arr[i]=arr[i].replace("i", "");
			arr[i]=arr[i].replace("o", "");
			arr[i]=arr[i].replace("u", "");	
		}
		return arr;
	} */
	
	


