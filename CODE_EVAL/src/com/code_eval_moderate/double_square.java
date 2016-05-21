package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class double_square {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		int num = in.nextInt();
		
		while (num != 0) {
			double value = in.nextDouble();
			//System.out.println(value);
			int count=0;
			double sr = Math.sqrt(value);
			for (int i=0; i<= (int) sr; i++){
				for (int j=i; j<= (int) sr; j++){
					if (value == (i*i + j*j)){
						count++;
					}
				}
			}
			System.out.println(count);
			num--;
		}
		

	}

}
