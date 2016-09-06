package com.code_eval_moderate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//A double-square number is an integer X which can be expressed 
//as the sum of two perfect squares. 
//For example, 10 is a double-square because 10 = 3^2 + 1^2.
/* IN
6
10
25
3
0
1
36
 */
/* OUT
1
2
0
1
1
1
 */
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
		in.close();

	}

}
