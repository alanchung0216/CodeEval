package com.code_eval_easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 5/11/16
public class lowercase {
	public static void main(String[] args){
		File file = new File(args[0]);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				String line = in.nextLine();
				line = line.trim();
				String[] str = line.split(" ");
				for (int i=0; i<str.length; i++){
					if (i == str.length-1){
						System.out.printf("%s%n",str[i].toLowerCase());
					} else {
						System.out.printf("%s ",str[i].toLowerCase());
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

// 4/22/16
/*
public class lowercase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line=br.readLine()) != null) {
			line = line.trim();
			//System.out.println(line);
			String[] str = line.split(" ");
			for (int i=0; i<str.length; i++){
				String lower=str[i].toLowerCase();
				System.out.printf("%s",lower);
				if (i == str.length-1)
					System.out.printf("%n");
				else
					System.out.printf(" ");	
				
			}
		}
	}

}
*/