package first;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static class submarine {
		private int horizontal = 0;
		private int depth = 0;
		
		public int forward(int f) {	
			return this.horizontal += f;
		}
		
		public int down(int d) {
			return this.depth += d;
		}
		
		public int up(int u) {
			return this.depth -= u;
		}
		
		public int result() {
			return horizontal*depth;
		}
		
		public int gethorizontal(){
			return horizontal;
		}
		
		public int getdepth() {
			return depth;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = null;
		int result = 0;
		submarine mySub = new submarine();
		ArrayList<String> command = new ArrayList<String>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		try {
			scan = new Scanner(new File("input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (scan.hasNext()) {
			command.add(scan.next());
			number.add(scan.nextInt());
		}
		
		for(int i = 0; i < command.size(); i++) {
			if (command.get(i).equals("forward")) {
				mySub.forward(number.get(i));
				System.out.println("f"+number.get(i));
				System.out.println("H: "+mySub.gethorizontal());
				
			} else if(command.get(i).equals("down")) {
				mySub.down(number.get(i));
				System.out.println("d"+number.get(i));
				System.out.println("D: "+mySub.getdepth());
				
			} else if(command.get(i).equals("up")) {
				mySub.up(number.get(i));
				System.out.println("u"+number.get(i));
				System.out.println("D: "+mySub.getdepth());
				
			} else {
				System.out.println("Fehler");
			}
		}
		
		System.out.println("Final Horizontal: "+mySub.gethorizontal());
		System.out.println("FinalDepth: "+mySub.getdepth());
		System.out.println(mySub.result());
	}

}


