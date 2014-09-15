/*
 * Josh Pollmann
 * 9/14/14
 * This class contains the main method and also methods for populating arrays
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCodeTester {
	
	public static void populateAlphaArray(ArrayList<String> alpha){
		 alpha.add("a");
	 	 alpha.add("b");
	 	 alpha.add("c");
	 	 alpha.add("d");
	 	 alpha.add("e");
	 	 alpha.add("f");
	 	 alpha.add("g");
	 	 alpha.add("h");
	 	 alpha.add("i");
	 	 alpha.add("j");
	 	 alpha.add("k");
	 	 alpha.add("l");
	 	 alpha.add("m");
	 	 alpha.add("n");
	 	 alpha.add("o");
	 	 alpha.add("p");
	 	 alpha.add("q");
	 	 alpha.add("r");
	 	 alpha.add("s");
	 	 alpha.add("t");
	 	 alpha.add("u");
	 	 alpha.add("v");
	 	 alpha.add("w");
	 	 alpha.add("x");
	 	 alpha.add("y");
	 	 alpha.add("z");
	 	 alpha.add("1");
	 	 alpha.add("2");
	 	 alpha.add("3");
	 	 alpha.add("4");
	 	 alpha.add("5");
	 	 alpha.add("6");
	 	 alpha.add("7");
	 	 alpha.add("8");
	 	 alpha.add("9");
	 	 alpha.add("0");
	}
	
	public static void populateMorseArray(ArrayList<String> morse) throws FileNotFoundException{
		 String token = "";
		 File fileName = new File("morse.txt");
	     Scanner inFile = new Scanner(fileName);
	     while (inFile.hasNext()){
	        token = inFile.next( );
	        morse.add(token);
	     }
	     inFile.close();
	}
	
	public static void main(String[] args) throws IOException{
	     ArrayList<String> morse = new ArrayList<String>(); 
	 	 ArrayList<String> alpha = new ArrayList<String>();
	 	 MorseCode morseCode = new MorseCode();
	 	 populateAlphaArray(alpha);
	 	 populateMorseArray(morse);
	 	 System.out.println("Enter a sentence without punctuation.");
	 	 morseCode.print(morse, alpha);
	 }
}
