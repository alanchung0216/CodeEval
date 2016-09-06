package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// find max of sum of continuous integers subarray
/* IN
-10,2,3,-2,0,5,-15
2,3,-2,-1,10
 */
/* OUT
8
12
 */
public class sum_integers {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] str = line.trim().split(",");
			//if (str.length == 0) continue;
			int[] ia = new int[str.length];
			for (int i=0; i<str.length; i++){
				ia[i]=Integer.valueOf(str[i]);
				//System.out.println(ia[i]);
			}
			int max=0;
			int sum=0;
			for (int i=0;i< ia.length; i++) {
				sum = ia[i];
				if (sum > max) max= sum;
				for (int j=i+1; j< ia.length; j++) {
					sum = sum + ia[j];
					if (sum > max) max= sum;
				}
			}
			System.out.println(max);
		}
		in.close();

	}

}
