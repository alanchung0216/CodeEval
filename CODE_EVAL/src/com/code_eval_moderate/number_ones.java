package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class number_ones {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNext()){
			int value = in.nextInt();
			int count_one=0;
			while (value != 0){
				//System.out.println(value);
				if ((value % 2) == 1) {
					count_one++;
				}
				value = value >> 1;
			}
			System.out.println(count_one);
		}

	}

}
