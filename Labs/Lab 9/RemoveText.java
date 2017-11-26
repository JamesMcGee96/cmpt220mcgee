//package driver_proj0.java;
import java.io.*;
import java.util.*;
public class RemoveText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length != 2)
		{
		   System.out.println("Usage: java RemoveText sourceFile oldStr");
		  System.exit(0);
		}   
		File sourceFile = new File(args[0]);
		if(!sourceFile.exists())
		{
		      System.out.println("Source file does not exist. Program will exit. ");
		  System.exit(0);
		}
		File tempFile = new File("temp_" + args[0]);
		Scanner input = new Scanner(sourceFile);
		PrintWriter output = new PrintWriter(tempFile);
		while(input.hasNext())
		{
		  String s1 = input.nextLine();
		  String s2 = s1.replaceAll(args[1],"");
		  output.println(s2);
		}
		input.close(); 
		output.close(); 
		sourceFile.delete(); 
		tempFile.renameTo(sourceFile);
		tempFile.delete();  
	}

}
