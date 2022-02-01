package first;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Diagnostic {
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = null;
		ArrayList<String> input = new ArrayList<String>();
		ArrayList<char[]> convertedInput = new ArrayList<char[]>();
		StringBuilder stringBuilderGamma = new StringBuilder();
		StringBuilder stringBuilderEpsilon = new StringBuilder();
		int resultGamma =0, resultEpsilon =0;
		
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
			ArrayList<Integer> digits = new ArrayList<Integer>();
			int zero = 0,one = 0;
			
			for(int n = 0; n < convertedInput.size();n++) {
				char[] splitter = convertedInput.get(n);
				digits.add((int) splitter[i]);
			}
			for(Integer y : digits) {
				if(y>0) {
					one++;
				} else {
					zero++;
				} 
			}
			
			if(one > zero) {
				stringBuilderGamma.append("1");
				stringBuilderEpsilon.append("0");
			} else {
				stringBuilderGamma.append("0");
				stringBuilderEpsilon.append("1");
			}
		}
		
		System.out.println(stringBuilderGamma);
		System.out.println(stringBuilderEpsilon);
		resultGamma = Integer.parseInt(stringBuilderGamma.toString(),2);
		resultEpsilon = Integer.parseInt(stringBuilderEpsilon.toString(),2);
		System.out.println("Gamma Gesamt:"+resultGamma);
		System.out.println("Epsilon Gesamt:"+resultEpsilon);
		System.out.println("Diagnose: "+(resultGamma+resultEpsilon));
	}	
		
}

