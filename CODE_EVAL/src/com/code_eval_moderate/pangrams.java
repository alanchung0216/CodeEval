package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pangrams {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNext()) {
			String line = in.nextLine().toLowerCase();
			char[] ca = line.toCharArray();
			int[] num = new int[26];
			for (int i=0; i<ca.length; i++){
				if (ca[i] < 'a' || ca[i] > 'z') continue;
				num[ca[i]-'a'] = 1;
			}
			boolean pang = true;
			for (int i=0; i<num.length; i++){
				if (num[i] == 0) {
					pang = false;
					System.out.printf("%c",i+'a');
				}
			}
			if (pang) 
				System.out.println("NULL");
			else
				System.out.println();
			
		}
		in.close();
	}

}
