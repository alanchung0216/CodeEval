package com.code_eval_easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class rightmost_char {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			//System.out.println(line);
			String[] str = line.trim().split(",");
			if (str.length == 0 || str.length==1) {
				//System.out.println("empty");
				continue;
			}
			char[] ca = str[0].toCharArray();
			boolean found = false;
			for (int i=ca.length-1; i>=0; i--){
				//System.out.println("ca " + i);
				if (ca[i] == str[1].charAt(0)) {
					System.out.println(i);
					found = true;
					break;
				}
			}
			if (found == false) System.out.println(-1);
		}
		in.close();

	}

}
