package driver_proj0.java;
import java.io.*;
import java.util.*;
public class Count {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
if(args.length!= 1) {
	System.out.println("Command-line argument is missing");
	System.exit(1);
}

String fileName = args[0];
File source = new File(fileName);

if(!source.exists()) {
	System.out.println(fileName + "File doesn't exist");
	System.exit(2);
}

Scanner infile = new Scanner(source);
String line;

int charactersCount = 0;
int wordsCount = 0;
int linesCount = 0;

while(infile.hasNextLine()) {
	line = infile.nextLine();
	linesCount++;
	String[] words = line.split("");
	wordsCount += words.length;
	
	for(String token : words){
		charactersCount += token.length();
	}
}

System.out.println("Number of lines in the file: " + linesCount );
System.out.println("Number of words in the file: " + wordsCount );
System.out.println("Number of characters in the file: " + charactersCount );
	}

}
