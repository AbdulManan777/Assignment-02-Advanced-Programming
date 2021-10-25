package ap.Assign2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Flightavailable {

	
	public void CheckAvailable() throws DateException, IOException {
		
		
			
		
			Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		
		System.out.print("Enter a Date to check for flight: ");  
		String a = sc.next();
		
		int count=0;
		
		File f1=new File("Data.txt"); //Creation of File Descriptor for input file
	      String[] words=null;  //Intialize the word Array
	      FileReader fr = new FileReader(f1);  //Creation of File Reader object
	      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	      String s;     
	         // Input word to be searched
	      //int count=0;   //Intialize the word to zero
	      while((s=br.readLine())!=null)   //Reading Content from the file
	      {
	         words=s.split(" ");  //Split the word using space
	          for (String word : words) 
	          {
	                 if (word.equals(a))   //Search for the given word
	                 {
	                   count++;    //If Present increase the count by one
	                 }
	          }
	      }
		if(count>0)
			System.out.println(count+" "+"Filghts available on this Date");
		
		
		else 
			throw new DateException("No Flight available on this Date");
		
	
	}
		
	

}

