package com.code_eval_easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sum_int_file {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		int sum=0;
		while (in.hasNext()) {
			sum += in.nextInt();		
		}
		System.out.println(sum);
	}

}
