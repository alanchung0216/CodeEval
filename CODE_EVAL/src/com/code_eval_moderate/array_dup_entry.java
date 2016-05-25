package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class array_dup_entry {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNext()){
			String line = in.nextLine().trim();
			if (line.length() == 0) continue;
			String[] str = line.split(";");
			int num = Integer.valueOf(str[0]);
			String[] stra = str[1].split(",");
			int[] inta = new int[stra.length];
			for (int i=0; i < stra.length; i++){
				inta[i]=Integer.valueOf(stra[i]);
			}
			int total_n_2=0;
			int total_inta=0;
			for (int i=0; i<= num-2; i++){
				total_n_2 += i;
			}
			for (int i=0; i< inta.length; i++) {
				total_inta += inta[i];
			}
			System.out.println(total_inta-total_n_2);
		}
		
	}

}
