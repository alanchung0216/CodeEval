package com.code_eval_easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 5/10/16
// 4/23/16

public class reverse_words {

	public static void main(String[] args) {
		File file = new File(args[0]);
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()){
				String line = sc.nextLine();
				if (line.trim().length() == 0) continue;
				String[] str = line.trim().split(" ");
				if (str.length == 0) continue;
				// now let's swap words
				for (int i=0; i < str.length/2; i++){
					String temp = str[str.length-1-i];
					str[str.length-1-i] = str[i];
					str[i] = temp;
				}
				for (int i=0; i < str.length; i++){
					//System.out.printf("%s",str[i]);
					if (i==str.length-1) System.out.printf("%n",str[i]);
					else System.out.printf("%s ",str[i]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
