package second;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Diagnostic_Two {
	
	public static void main(String[] args) {
		Scanner scan = null;
		ArrayList<String> input = new ArrayList<String>();
		ArrayList<char[]> convertedInput = new ArrayList<char[]>();
		
		try {
			scan = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (scan.hasNext()) {
			input.add(scan.next());
		}
		
		for(String i : input) {
			convertedInput.add(i.toCharArray());
		}
		
		for(int i = 0; i < 12; i++) {
			ArrayList<Integer> chosenDigit = new ArrayList<Integer>();
			ArrayList<Integer> indexOne = new ArrayList<Integer>();
			ArrayList<Integer> indexZero = new ArrayList<Integer>();
			int zero = 0,one = 0;
			for(int n = 0; n < convertedInput.size();n++) {
				char[] splitter = convertedInput.get(n);
				chosenDigit.add(Integer.parseInt(String.valueOf(splitter[i])));
			}
			for(int y=0; y < chosenDigit.size(); y++) {
				if(chosenDigit.get(y)>0) {
					one++;
					indexOne.add(y);
				} else {
					zero++;
					indexZero.add(y);
				} 
			}
			
			if(one > zero) {
				
			} else {

			}
		}
	}	
		
}

