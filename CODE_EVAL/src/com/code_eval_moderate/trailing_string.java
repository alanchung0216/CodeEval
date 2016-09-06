package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Hello World,World
Hello CodeEval,CodeEval
San Francisco,San Jose
 */
/*Print 1 if the second string occurs at the end of the first string. 
 * Otherwise, print 0.
1
1
0
 */
// 5/11/16 a correct way
public class trailing_string {
	public static void main(String[] args){
		File file = new File(args[0]);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()){
				String line = in.nextLine();
				line = line.trim();
				if (line.length() == 0) continue;
				String[] str = line.split(",");
				/* can't use this way
				String[] str1 = str[0].split(" ");
				String[] str2 = str[1].split(" ");
				*/
				String str1 = str[0].trim();
				String str2 = str[1].trim();
				if (str1.endsWith(str2)){ // endsWith is suffix of str1
				//if ((str1[str1.length-1].compareTo(str2[0])) == 0) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

// 4/22/16

/* 
public class trailing_string {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		
		while (sc.hasNext()) {
			String line=sc.nextLine();
			line = line.trim();
			if (line.length() == 0) continue;
			String[] str = line.split(",");
			
			String[] str1 = str[0].split(" ");
			String[] str2 = str[1].split(" ");
			//if (str1.length == 0 || str2.length ==0) 
			//	System.out.println("0");
			if (str1[str1.length-1].compareTo(str2[0]) == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

	}

}
*/