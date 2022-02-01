package day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SonarSweep {

	
	public static void firststep() {
		Scanner scan = null;
		int result = 0;
		ArrayList<Integer> input = new ArrayList<Integer>();
		
		try {
			scan = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (scan.hasNext()) {
			input.add(scan.nextInt());
		}
		
		for(int i = 0; i < input.size()-1; i++) {

			if(input.get(i+1) > input.get(i)) {
				result++;
			}
		}
		
		scan.close();
		System.out.println("Gesamt: "+result);
	}
	
	public static void secondstep() {
		Scanner scan = null;
		int result = 0;
		ArrayList<Integer> input = new ArrayList<Integer>();
		
		try {
			scan = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (scan.hasNext()) {
			input.add(scan.nextInt());
		}
		
		for(int i = 0; i < input.size() - 3; i++) {
			int sumA = input.get(i) + input.get(i + 1) + input.get(i + 2);
			int sumB = input.get(i + 1) + input.get(i + 2) + input.get(i + 3);
			
			if(sumB > sumA) {
				result++;
			}
		}
		
		scan.close();
		System.out.println("Gesamt: "+result);
	}

	public static void main(String[] args) {
		firststep();
		secondstep();
	}

}


