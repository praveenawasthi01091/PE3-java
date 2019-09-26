package com.stackroute.main;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Q9 {

	public static void main(String[] args) throws IOException
	{
	
		  File file =new File("src/com/stackroute/main/file.txt");
		  System.out.println(file);
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  List <String>list=new ArrayList<String>();
		  String st; 
		  /* reading */
		  while ((st = br.readLine()) != null) 
		  {
			st = st.toUpperCase();	
		    System.out.println(st); 
		    list.add(st);
		  }
		  System.out.println(file.length());
		  br.close();
          /*   writing    */
		  Charset utf8 = StandardCharsets.UTF_8;
		  Files.write(Paths.get("src/com/stackroute/main/file.txt"), list, utf8);

	}

}
