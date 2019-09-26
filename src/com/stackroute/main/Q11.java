package com.stackroute.main;

import java.io.*;
import java.util.*;

public class Q11 {

	public static void main(String[] args) throws IOException
	{
	
		  File file =new File("src/com/stackroute/main/file.txt");
		  System.out.println(file);
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String st;
		  Map<String,Integer> wordCount = new HashMap<String, Integer>();
		  while ((st = br.readLine()) != null) 
		  {
			String words[]=st.split("[\\s , ' ! ? .]+");
			for(int i=0;i<words.length;i++)
			{
				if (wordCount.containsKey(words[i]))
				{ 
					  int n = wordCount.get(words[i]);    
					  wordCount.put(words[i], ++n);
				}
					// Otherwise, puts the word into the HashMap
				else 
				{
					  wordCount.put(words[i], 1);
				}
			}
		  }		
		  for (Map.Entry entry : wordCount.entrySet())
		  {
			  System.out.println(entry.getKey() + ": " + entry.getValue());
		  }

	}

}
