package com.code_eval_easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 5/11/16  less efficient because of char[]
public class sum_digits {
	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null){
				line = line.trim();
				char[] ca = line.toCharArray();
				int sum=0;
				for (int i=0; i<ca.length; i++){
					sum += (Integer.valueOf(ca[i]) - Integer.valueOf('0'));
				}
				System.out.println(sum);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// 4/21/16
/*
public class sum_digits {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()){
			int intg=sc.nextInt();
			//System.out.println(intg);
			int sum=0;
			while (intg != 0) {
				sum += intg%10;
				intg = intg/10;
			}
			System.out.println(sum);
		}

	}

}
*/
