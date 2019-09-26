package com.stackroute.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;


public class Q10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File folder = new File("."); // current folder so
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) 
		{
		  if (listOfFiles[i].isFile())
		  {
		    System.out.println("File " + listOfFiles[i].getName());
		  } 
		  // for folders
		  /*
		  else if (listOfFiles[i].isDirectory()) 
		  {
		    System.out.println("Directory " + listOfFiles[i].getName());
		  }*/
		}
		
		System.out.println("******** filter only text file **********");
		File[] files = new File(".").listFiles((dir, name) -> name.endsWith(".txt")); // . bcoz same folder
		for (int i = 0; i < files.length; i++) 
		{
		  if (files[i].isFile())
		  {
		    System.out.println("Text File " + files[i].getName());
		    byte[] fileContent = Files.readAllBytes(files[i].toPath());
		    System.out.println("**** content********");
		    System.out.println(Arrays.toString(fileContent));
		    System.out.println();
		  } 
		} 

	}

}
