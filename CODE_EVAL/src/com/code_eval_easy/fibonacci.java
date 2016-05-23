package com.code_eval_easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 5/11/16
//
public class fibonacci {
	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line=br.readLine()) != null){
			line = line.trim();
			int value = Integer.valueOf(line);
			// f(n) = f(n-2) + f(n-1)
			if (value==0 || value==1) {
				System.out.println(value);
				continue;
			}
			// 0, 1, 1, 2, 3, 5
			int f_n_2=0;
			int f_n_1=1;
			int f_n=0;
			for (int i=2; i<=value; i++){
				f_n = f_n_2 + f_n_1;
				f_n_2 = f_n_1;
				f_n_1 = f_n;				
			}
			System.out.println(f_n);
		}
		br.close();
	}
}

// 4/21/16
/*
public class fibonacci {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println(0);
				continue;
			}
			if (num == 1) {
				System.out.println(1);
				continue;
			}
			int f_n_2=0; // f(n-2)
			int f_n_1=1; // f(n-1)
			int f_n=0; // f(n)
			for (int i=2; i<=num; i++) {
				f_n = f_n_1+f_n_2;
				f_n_2 = f_n_1;
				f_n_1 = f_n;				
			}
			System.out.println(f_n);
		}

	}

}
*/
