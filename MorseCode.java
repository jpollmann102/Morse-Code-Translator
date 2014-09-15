/*
 * Josh Pollmann
 * 9/14/14
 * This class contains the methods used in MorseCodeTester
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MorseCode {

	public MorseCode(){
	}

	public static void convertText(ArrayList<String> morse, ArrayList<String> alpha){
		Scanner sc = new Scanner(System.in);
		String next = sc.nextLine().toLowerCase();
		for(int i = 0; i < next.length(); i++){
			String s = next.substring(i, i + 1);
			findMorse(s, alpha, morse);
		}
	}
	
	public static void findMorse(String s, ArrayList<String> alpha, ArrayList<String> morse){
		if(s.equals(" ")){
			System.out.print(" / ");
		}
		for(int i = 0; i < alpha.size(); i++){
			if(s.equals(alpha.get(i))){
				System.out.print(morse.get(i) + " ");
			}
		}
	}
	
	public void print(ArrayList<String> morse, ArrayList<String> alpha){
		convertText(morse, alpha);
	}
}
