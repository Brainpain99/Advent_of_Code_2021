package day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SonarSweep {

	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int counter = 0;
		ArrayList<Integer> input = new ArrayList<Integer>();
		while (scan.hasNext()) {
			input.add(scan.nextInt());
			counter++;
		}
		for(Integer i : input){
			
		}
		
		scan.close();
	}

}
