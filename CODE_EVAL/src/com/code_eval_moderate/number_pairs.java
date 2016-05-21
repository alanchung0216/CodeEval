package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class number_pairs {
/*
1,2,3,4,6;5
2,4,5,6,9,11,15;20
1,2,3,4;50
 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNext()) {
			String line = in.nextLine();
			String[] str = line.trim().split(";");
			if (str.length == 0 || str.length == 1) continue;
			String[] str_1 = str[0].trim().split(",");
			int[] ia = new int[str_1.length];
			for (int i=0; i< ia.length; i++){
				ia[i] = Integer.valueOf(str_1[i]);
			}
			int sum = Integer.valueOf(str[1]);
			int count=0;
			for (int i=0; i<ia.length; i++){
				if (ia[i] > sum) break;
				for (int j=i+1; j < ia.length; j++){
					if (ia[i] + ia[j] == sum) {
						if (count > 0) 
							System.out.printf(";%d,%d",ia[i],ia[j]);
						else
							System.out.printf("%d,%d",ia[i],ia[j]);
						count++;
					}
				}
			}
			if (count > 0)
				System.out.println();
			else
				System.out.println("NULL");
			
		}
		in.close();

	}

}
